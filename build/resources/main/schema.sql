DROP VIEW friends_list IF EXISTS;

DROP TABLE people IF EXISTS;
CREATE TABLE people(
    id INTEGER PRIMARY KEY,
    name VARCHAR(255), 
    city VARCHAR(255)
);
DROP TABLE friends IF EXISTS;
CREATE TABLE friends(
    person INTEGER,
    friend INTEGER,
    PRIMARY KEY(person, friend)
);

CREATE VIEW friends_list AS
    select 
    	a.person personID,
        a.friend friendID,
        b.name friendName,
        b.city friendCity
    from 
        friends a 
    left join 
        people b 
    on a.friend = b.id;