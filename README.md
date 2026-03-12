# restaurant-bff-service

Ktor-based Backend-for-Frontend (BFF) service.

Showcasing my ability to build backend software in Kotlin, complementing my existing experience in Java.

### Features
- Simple routing: `/home` and `/health` endpoints
- Containerized with Docker
- Deployable to Google Cloud Run

### Local Docker Run
- docker build -t restaurant-bff-service:local .
- docker run -p 8080:8080 restaurant-bff-service:local

### Deployment on Google Cloud Run
- docker build -t gcr.io/restaurant-bff-service/restaurant-bff-service:latest .
- docker push gcr.io/restaurant-bff-service/restaurant-bff-service:latest
- gcloud run deploy restaurant-bff-service --image gcr.io/restaurant-bff-service/restaurant-bff-service:latest --platform managed

### Live demo: https://restaurant-bff-service-365004434291.europe-west4.run.app/home

### Tech Stack
- Kotlin
- Ktor
- Docker
- Google Cloud Run

## Todo:
- Add coroutines for async processing
- Add OpenTelemetry for monitoring