package com.example.cinemamanagement.controller;

import com.example.backendcoreservice.api.ApiResponse;
import com.example.backendcoreservice.api.ApiResponseBuilder;
import com.example.backendcoreservice.controller.AbstractController;
import com.example.cinemamanagement.dto.HallDto;
import com.example.cinemamanagement.service.HallService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/hall")
@AllArgsConstructor
public class HallController implements AbstractController<HallService, HallDto> {

    private final HallService hallService;
    private final ApiResponseBuilder<HallDto> apiResponseBuilder;

    @Override
    public HallService getService() {
        return hallService;
    }

    @Override
    public ApiResponseBuilder<HallDto> getApiResponseBuilder() {
        return apiResponseBuilder;
    }

    @GetMapping("/all")
    public ApiResponse<List<HallDto>> findAll() {
        return getApiResponseBuilder().buildSuccessResponse(getService().findAll());
    }


}
