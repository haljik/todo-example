#!/bin/sh

docker build -t todo-database ../todo-database

../gradlew :todo-editor-api:build
docker build -t todo-editor-api ./

docker stop todo-db
docker rm todo-db
docker stop editor-api
docker rm editor-api

docker run -d --name todo-db todo-database
docker run -p 8888:8888 -name editor-api --link=todo-db:db todo-editor-api