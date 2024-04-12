--liquibase formatted sql
--changeset sayed:20240412_booking_table
CREATE SEQUENCE public.booking_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE public.booking
(
    id                BIGINT                 NOT NULL DEFAULT nextval('booking_id_sequence'),
    user_id           BIGINT                 NOT NULL,
    show_time_id      BIGINT                 NOT NULL,
    seat_id           BIGINT                 NOT NULL,
    booking_date      TIMESTAMP              NOT NULL,
    status            CHARACTER VARYING(100) NOT NULL,

    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT booking_pk PRIMARY KEY (id),
    CONSTRAINT booking_user_id_fk FOREIGN KEY (user_id) REFERENCES public.user (id),
    CONSTRAINT booking_show_time_id_fk FOREIGN KEY (show_time_id) REFERENCES public.show_time (id),
    CONSTRAINT booking_seat_id_fk FOREIGN KEY (seat_id) REFERENCES public.seat (id)

);
