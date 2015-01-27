#!/bin/sh

../gradlew :todo:build
docker build -t todo ./

docker stop todo
docker rm todo

docker run -p 8080:8080 -name todo todo