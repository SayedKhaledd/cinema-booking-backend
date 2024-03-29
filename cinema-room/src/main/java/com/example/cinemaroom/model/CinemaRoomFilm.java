package com.example.cinemaroom.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CinemaRoomFilm {
    private Long id;
    private Film film;
    private Long filmId;
    private CinemaRoom cinemaRoom;
    private Long cinemaRoomId;
}
