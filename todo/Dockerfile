FROM ubuntu
MAINTAINER s.kawakami.biz@gmail.com

RUN apt-get update && apt-get install -y python-software-properties software-properties-common
RUN echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections
RUN add-apt-repository -y ppa:webupd8team/java
RUN apt-get update
RUN apt-get install -y oracle-java8-installer

ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

ADD ./build/libs/todo-0.0.1.jar todo.jar

EXPOSE 8080

CMD ["java", "-jar", "./todo.jar",\
    "--spring.datasource.initialize=false",\
    "--spring.datasource.driverClassName=org.postgresql.Driver",\
    "--spring.datasource.url=jdbc:postgresql://${DB_PORT_5432_TCP_ADDR}:${DB_PORT_5432_TCP_PORT}/todo_database",\
    "--spring.datasource.username=todo_user",\
    "--spring.datasource.password=todo_password"]

