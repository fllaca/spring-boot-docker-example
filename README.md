# Spring Boot Dockerfiles Example

[Slides](https://fllaca.github.io/spring-boot-docker-example/)

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
