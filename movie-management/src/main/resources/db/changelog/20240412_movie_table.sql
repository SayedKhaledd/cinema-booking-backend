--liquibase formatted sql
--changeset sayed:20240412_movie_table
CREATE SEQUENCE public.movie_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE public.movie
(
    id                BIGINT                 NOT NULL DEFAULT nextval('movie_id_sequence'),
    title             CHARACTER VARYING(100) NOT NULL,
    description       CHARACTER VARYING(1000),
    release_date      TIMESTAMP              NOT NULL,
    cover_image       CHARACTER VARYING(100),
    duration          DECIMAL(2, 1)          NOT NULL,
    rating            DECIMAL(2, 1)          NOT NULL,

    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT movie_pk PRIMARY KEY (id)
);
