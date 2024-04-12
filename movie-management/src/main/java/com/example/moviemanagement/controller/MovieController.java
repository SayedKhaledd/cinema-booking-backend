package com.example.moviemanagement.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.moviemanagement.dto.MovieDto;
import com.example.moviemanagement.service.MovieService;
import com.example.backendcoreservice.controller.AbstractController;


@RestController
@RequestMapping("/api/movie")
@AllArgsConstructor
public class MovieController implements AbstractController<MovieService, MovieDto> {

    private final MovieService movieService;


    @Override
    public MovieService getService() {
        return movieService;
    }





}
