package com.example.cinemamanagement.controller;

import com.example.backendcoreservice.api.ApiResponseBuilder;
import com.example.backendcoreservice.controller.AbstractController;
import com.example.cinemamanagement.dto.SeatDto;
import com.example.cinemamanagement.service.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/seat")
@AllArgsConstructor
public class SeatController implements AbstractController<SeatService, SeatDto> {

    private final SeatService seatService;
    private final ApiResponseBuilder<SeatDto> apiResponseBuilder;


    @Override
    public SeatService getService() {
        return seatService;
    }

    @Override
    public ApiResponseBuilder<SeatDto> getApiResponseBuilder() {
        return apiResponseBuilder;
    }
}
