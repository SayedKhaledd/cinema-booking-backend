package com.example.cinemamanagement.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cinemamanagement.dto.HallDto;
import com.example.cinemamanagement.service.HallService;
import com.example.backendcoreservice.controller.AbstractController;


@RestController
@RequestMapping("/api/hall")
@AllArgsConstructor
public class HallController implements AbstractController<HallService, HallDto> {

    private final HallService hallService;


    @Override
    public HallService getService() {
        return hallService;
    }





}
