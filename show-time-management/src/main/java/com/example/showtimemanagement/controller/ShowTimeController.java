package com.example.showtimemanagement.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.showtimemanagement.dto.ShowTimeDto;
import com.example.showtimemanagement.service.ShowTimeService;
import com.example.backendcoreservice.controller.AbstractController;


@RestController
@RequestMapping("/api/show-time")
@AllArgsConstructor
public class ShowTimeController implements AbstractController<ShowTimeService, ShowTimeDto> {

    private final ShowTimeService showtimeService;


    @Override
    public ShowTimeService getService() {
        return showtimeService;
    }





}
