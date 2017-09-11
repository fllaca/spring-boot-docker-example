# Spring Boot Dockerfiles Example

[Slides](https://fllaca.github.io/spring-boot-docker-example/)

## Build services and Docker images

```
mvn package
```

## Start Docker Local environment

```
docker-compose up -d
```

## Rebuild everything

```
 docker-compose down && \
  mvn clean package && \
  docker-compose build --no-cache && \
  docker-compose up -d
```
