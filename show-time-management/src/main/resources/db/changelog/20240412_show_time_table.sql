--liquibase formatted sql
--changeset sayed:20240412_show_time_table
CREATE SEQUENCE public.show_time_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE public.show_time
(
    id                BIGINT                 NOT NULL DEFAULT nextval('show_time_id_sequence'),
    time              TIMESTAMP              NOT NULL,
    movie_id          BIGINT                 NOT NULL,
    hall_id           BIGINT                 NOT NULL,
    price             DECIMAL(10, 2)         NOT NULL,

    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT show_time_pk PRIMARY KEY (id),
    CONSTRAINT show_time_movie_fk FOREIGN KEY (movie_id) REFERENCES public.movie (id),
    CONSTRAINT show_time_hall_fk FOREIGN KEY (hall_id) REFERENCES public.hall (id)
);
