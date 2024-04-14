package com.example.cinemamanagement.service;

import com.example.cinemamanagement.dto.CinemaDto;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class CinemaServiceSetup {

    public static CinemaDto addRandomCinema(CinemaService cinemaService) {
        CinemaDto cinemaDto = CinemaDto.getInstance("Cinema" + UUID.randomUUID() + System.currentTimeMillis(),
                "Location" + UUID.randomUUID() + System.currentTimeMillis());
        return cinemaService.create(cinemaDto);
    }

    public static List<CinemaDto> addRandomCinemas(CinemaService cinemaService) {
        List<CinemaDto> cinemaDtos = new java.util.ArrayList<>(List.of());
        IntStream.range(0, 5).forEach(i -> cinemaDtos.add(addRandomCinema(cinemaService)));
        return cinemaDtos;
    }
}
