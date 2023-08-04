# demo-spring-project
Demo Spring project for measuring time execution using HotSpot vs openj9.
Simple Spring application that makes a request to the database and terminates.

## DDL script:
``` sql
CREATE DATABASE demo;

CREATE TABLE users
(
    id    SERIAL PRIMARY KEY,
    email VARCHAR(128) UNIQUE NOT NULL,
    name  VARCHAR(32)         NOT NULL
);

INSERT INTO users (email, name)
VALUES ('test@mail.ru', 'Ivan Ivanov'),
       ('test2@mail.ru', 'Petr Petrov');
```
