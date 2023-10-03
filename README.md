# Spring Boot Rest API

## Build the project

```bash
mvn clean install
```

## Run the project

```bash
mvn spring-boot:run
```

## Test the project

```bash
curl http://localhost:8080/hello
```

## Test the reverse operation

```bash
curl http://localhost:8080/reverse?text=hello
```

## Test the remove vowels operation

```bash
curl http://localhost:8080/remove-vowels?text=hello
```

## Run unit test

```bash
mvn test
```

# Containerize the application

## Build image

```bash
docker build -t demo0310 .
```

## Run container

```bash
docker run -p 8080:8080 demo0310
```

# Deploy using Github actions

