#!/bin/sh

docker build -t todo_database_image ../database

../gradlew :todo:build
docker build -t todo_application_image ./

docker stop todo_db_container
docker rm todo_db_container
docker stop todo_app_container
docker rm todo_app_container

docker run -d --name todo_db_container todo_database_image
docker run -p 8080:8080 --name todo_app_container --link=todo_db_container:db todo_application_image
