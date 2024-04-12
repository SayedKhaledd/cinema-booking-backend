--liquibase formatted sql
--changeset sayed:20240412_user_table
CREATE SEQUENCE public.user_id_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE public.user
(
    id                BIGINT                 NOT NULL DEFAULT nextval('user_id_sequence'),
    first_name        CHARACTER VARYING(100) NOT NULL,
    last_name         CHARACTER VARYING(100) NOT NULL,
    email             CHARACTER VARYING(100) NOT NULL,
    keycloak_id       CHARACTER VARYING(100) NOT NULL,
    phone_number      CHARACTER VARYING(100),

    created_date      TIMESTAMP              NOT NULL,
    modified_date     TIMESTAMP              NOT NULL,
    created_by        CHARACTER VARYING(100) NOT NULL,
    modified_by       CHARACTER VARYING(100) NOT NULL,
    marked_as_deleted BOOLEAN                NOT NULL DEFAULT FALSE,
    CONSTRAINT user_pk PRIMARY KEY (id),
    CONSTRAINT user_email_unique UNIQUE (email)

);
