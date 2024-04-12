--liquibase formatted sql
--changeset sayed:20240412_hall_table
CREATE SEQUENCE hall_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE hall
(
    id                     BIGINT                 NOT NULL DEFAULT nextval('hall_id_sequence'),
    name                   VARCHAR(255)           NOT NULL,
    cinema_id              BIGINT                 NOT NULL,
    number_of_seats        INTEGER                NOT NULL,
    number_of_rows         INTEGER                NOT NULL,
    number_of_seats_in_row INTEGER                NOT NULL,
    created_date           TIMESTAMP              NOT NULL,
    modified_date          TIMESTAMP              NOT NULL,
    created_by             CHARACTER VARYING(100) NOT NULL,
    modified_by            CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted      BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT hall_pk PRIMARY KEY (id),
    CONSTRAINT hall_name_unique UNIQUE (name),
    CONSTRAINT hall_cinema_fk FOREIGN KEY (cinema_id) REFERENCES cinema (id)
);
