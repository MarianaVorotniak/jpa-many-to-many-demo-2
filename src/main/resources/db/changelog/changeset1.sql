--liquibase formatted sql

--changeset Mariana:createPosts
CREATE TABLE Posts(
  id_p int PRIMARY KEY NOT NULL,
  name varchar(45) DEFAULT NULL
) ENGINE=InnoDB;


INSERT INTO Posts VALUES (1,'first post'),(2,'second post'), (3,'third post'),(4,'fourth post');