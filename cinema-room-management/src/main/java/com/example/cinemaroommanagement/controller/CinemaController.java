package com.example.cinemaroommanagement.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cinemaroommanagement.dto.CinemaDto;
import com.example.cinemaroommanagement.service.CinemaService;
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
