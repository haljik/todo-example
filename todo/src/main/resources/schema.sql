create schema todo;

create sequence todo.task_id_seq;

create table todo.tasks(
    task_id integer PRIMARY KEY,
    name varchar(50) NOT NULL,
    done boolean NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

