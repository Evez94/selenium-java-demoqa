# Java 17 və Maven olan rəsmi image
FROM maven:3.8.5-openjdk-17-slim

# Chrome brauzerini konteynerə yükləyirik
RUN apt-get update && apt-get install -y \
    wget \
    curl \
    gnupg \
    && wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list \
    && apt-get update \
    && apt-get install -y google-chrome-stable \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Faylları konteynerə kopyalayırıq
COPY pom.xml .
COPY testng.xml .
COPY src ./src

# Docker işə düşəndə testləri icra edir
CMD ["mvn", "clean", "test"]