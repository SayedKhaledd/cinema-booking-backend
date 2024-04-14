package com.example.cinemamanagement.controller;

import com.example.backendcoreservice.api.ApiResponse;
import com.example.backendcoreservice.api.ApiResponseBuilder;
import com.example.backendcoreservice.controller.AbstractController;
import com.example.cinemamanagement.dto.CinemaDto;
import com.example.cinemamanagement.service.CinemaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/cinema")
@AllArgsConstructor
public class CinemaController implements AbstractController<CinemaService, CinemaDto> {

    private final CinemaService cinemaService;
    private final ApiResponseBuilder<CinemaDto> apiResponseBuilder;


    @Override
    public CinemaService getService() {
        return cinemaService;
    }

    @Override
    public ApiResponseBuilder<CinemaDto> getApiResponseBuilder() {
        return apiResponseBuilder;
    }

    @GetMapping("/{id}")
    public ApiResponse<CinemaDto> findById(@PathVariable Long id) {
        return getApiResponseBuilder().buildSuccessResponse(getService().findById(id));
    }


    @GetMapping("/all")
    public ApiResponse<List<CinemaDto>> findAll() {
        return getApiResponseBuilder().buildSuccessResponse(getService().findAll());
    }
}
