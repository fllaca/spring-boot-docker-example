# Spring Boot Dockerfiles Example

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
