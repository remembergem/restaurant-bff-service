FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy Gradle wrapper + build files
COPY gradlew .
COPY gradle ./gradle
COPY build.gradle.kts settings.gradle.kts ./

# Copy source code
COPY src ./src

# Build the Ktor application
RUN ./gradlew installDist -x test

# Run the Ktor app
CMD ["build/install/restaurant-bff-service/bin/restaurant-bff-service"]