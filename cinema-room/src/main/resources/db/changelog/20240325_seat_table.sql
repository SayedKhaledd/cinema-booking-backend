--liquibase formatted sql
--changeset sayed:20240325_seat_table.sql

CREATE SEQUENCE seat_id_seq
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE seat
(
    id   INT PRIMARY KEY DEFAULT nextval('seat_id_seq'::regclass),
    name VARCHAR(255) NOT NULL,

    constraint cinema_room_pk PRIMARY KEY (id)
);