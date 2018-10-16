DROP TABLE people IF EXISTS;
CREATE TABLE people(
    id INTEGER PRIMARY KEY,
    name VARCHAR(255), 
    city VARCHAR(255)
);
DROP TABLE friends IF EXISTS;
CREATE TABLE friends(
    person INTEGER PRIMARY KEY,
    friend INTEGER PRIMARY KEY
);