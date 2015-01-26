create schema todo;

create sequence todo.task_id_seq;

create table todo.tasks(
    task_id integer PRIMARY KEY,
    subject varchar(50) NOT NULL,
    created_at TIMESTAMP NOT NULL
);

