--liquibase formatted sql

--changeset Mariana:createPostTag
CREATE TABLE post_tag (
  id_p int NOT NULL,
  id_t int NOT NULL,
  PRIMARY KEY (id_p, id_t),
  FOREIGN KEY (id_p) REFERENCES Posts (id_p),
  FOREIGN KEY (id_t) REFERENCES Tags (id_t)
) ENGINE=InnoDB;

INSERT INTO post_tag VALUES (1,1),(2,2),(2,1),(1,2);