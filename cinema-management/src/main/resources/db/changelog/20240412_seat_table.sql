--liquibase formatted sql
--changeset sayed:20240412_seat_table
CREATE SEQUENCE public.seat_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE public.seat
(
    id                BIGINT                 NOT NULL DEFAULT nextval('seat_id_sequence'),
    seat_number       VARCHAR(255)           NOT NULL,
    hall_id           BIGINT                 NOT NULL,
    row_number        INTEGER                NOT NULL,
    column_number     INTEGER                NOT NULL,
    is_vip            BOOLEAN                NOT NULL DEFAULT FALSE,

    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT seat_pk PRIMARY KEY (id),
    CONSTRAINT seat_seat_number_hall UNIQUE (seat_number, hall_id),
    CONSTRAINT seat_hall_fk FOREIGN KEY (hall_id) REFERENCES public.hall (id)
);
