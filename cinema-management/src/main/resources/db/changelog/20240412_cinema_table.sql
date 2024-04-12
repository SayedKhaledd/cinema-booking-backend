--liquibase formatted sql
--changeset sayed:20240412_cinema_table
CREATE SEQUENCE public.cinema_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE public.cinema
(
    id                BIGINT                 NOT NULL DEFAULT nextval('cinema_id_sequence'),
    name              VARCHAR(255)           NOT NULL,
    location          VARCHAR(255)           NOT NULL,
    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT cinema_pk PRIMARY KEY (id),
    CONSTRAINT cinema_name_unique UNIQUE (name)
);
