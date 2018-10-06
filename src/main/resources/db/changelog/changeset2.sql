--liquibase formatted sql

--changeset Mariana:createTags
CREATE TABLE Tags (
  id_t int PRIMARY KEY NOT NULL,
  name varchar(45) DEFAULT NULL
) ENGINE=InnoDB;


INSERT INTO Tags VALUES (1,'first tag'),(2,'second tag');