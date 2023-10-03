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

# Deploy app in AKS

## Environment variables

```bash
export RESOURCE_GROUP=aks-demo-alb-rg
export CLUSTER_NAME=demo
export NAMESPACE=demo0310
```

## Get AKS credentials

```bash
az aks get-credentials --resource-group $RESOURCE_GROUP --name $CLUSTER_NAME
```

## Create namespace

```bash
kubectl create namespace $NAMESPACE
```

## Deploy app

```bash
kubectl apply -f k8s/application.yaml -n $NAMESPACE
```

## Get pods
    
```bash 
kubectl get pods -n $NAMESPACE
```

## Get service IP

```bash
export SVC_IP=`kubectl get service demo0310 -n $NAMESPACE -o jsonpath='{.status.loadBalancer.ingress[0].ip}'`
```

## Test the app

```bash
curl http://$SVC_IP:80/hello
```