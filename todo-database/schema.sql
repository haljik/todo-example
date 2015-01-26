create schema todo;

create table todo.tasks(
    task_id number PRIMARY KEY,
    subject varchar(50) NOT NULL,
    created_at TIMESTAMP NOT NULL
);

create table todo.tags(
    tag_id number PRIMARY KEY,
    tag varchar(50),
    created_at TIMESTAMP NOT NULL
);

create table todo.tasks_x_tags(
    task_id number REFERENCES todo.tasks(task_id);
    tag_id number PREFERENCE todo.tags(tag_id);
);
