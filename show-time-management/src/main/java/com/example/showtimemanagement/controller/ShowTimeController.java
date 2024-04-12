package com.example.showtimemanagement.controller;

import com.example.backendcoreservice.api.ApiResponseBuilder;
import com.example.backendcoreservice.controller.AbstractController;
import com.example.showtimemanagement.dto.ShowTimeDto;
import com.example.showtimemanagement.service.ShowTimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/show-time")
@AllArgsConstructor
public class ShowTimeController implements AbstractController<ShowTimeService, ShowTimeDto> {

    private final ShowTimeService showtimeService;
    private final ApiResponseBuilder<ShowTimeDto> apiResponseBuilder;


    @Override
    public ShowTimeService getService() {
        return showtimeService;
    }

    @Override
    public ApiResponseBuilder<ShowTimeDto> getApiResponseBuilder() {
        return apiResponseBuilder;
    }


}
