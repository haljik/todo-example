#!/bin/sh
docker build -t todo-database ./
docker run -p 5432:5432 -name todo-db
