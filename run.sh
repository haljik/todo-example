#!/bin/bash
docker build -t todo-database todo-database/
docker run -d -name db
