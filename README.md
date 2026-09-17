# Redis--postman
# Redis + Java (Javalin) Starter

Simple project connecting Java to Redis using Jedis, exposed via a Javalin REST API.

## What this does
- Runs Redis inside a Docker container
- Java app (Jedis) connects to that Redis instance
- Javalin exposes a REST endpoint to test the connection
- Hitting `/redis` pings Redis and returns `PONG` if alive

## Tech Stack
- Java 21+
- Maven
- Jedis (Redis client)
- Javalin (lightweight web framework)
- Docker + Docker Compose (for running Redis locally)

## Prerequisites
- Docker Desktop installed and running
- IntelliJ IDEA (or any Java IDE)
- Maven

## Setup & Run

1. **Start Redis container**
```bash
   docker compose up -d
```

2. **Verify Redis is running**
```bash
   docker ps
```

3. **Run the Java app**
   Open `Main.java` in IntelliJ → click Run ▶

4. **Test the API**
   Open Postman (or browser) → GET request:
