# Spring Boot Dockerfiles Example

Example of a Spring Boot Application with automated Docker images generation. Watch the [Slides](https://fllaca.github.io/spring-boot-docker-example/) for more info!

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

## Accessing to graylog

To see the logs you can go to [localhost:9000](http://localhost:9000) and access with credentials *admin/admin*.
