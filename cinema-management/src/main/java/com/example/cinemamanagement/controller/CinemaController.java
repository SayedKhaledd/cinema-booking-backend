package com.example.cinemamanagement.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cinemamanagement.dto.CinemaDto;
import com.example.cinemamanagement.service.CinemaService;
import com.example.backendcoreservice.controller.AbstractController;


@RestController
@RequestMapping("/api/cinema")
@AllArgsConstructor
public class CinemaController implements AbstractController<CinemaService, CinemaDto> {

    private final CinemaService cinemaService;


    @Override
    public CinemaService getService() {
        return cinemaService;
    }





}
