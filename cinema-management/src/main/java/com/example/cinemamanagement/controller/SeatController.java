package com.example.cinemamanagement.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cinemamanagement.dto.SeatDto;
import com.example.cinemamanagement.service.SeatService;
import com.example.backendcoreservice.controller.AbstractController;


@RestController
@RequestMapping("/api/seat")
@AllArgsConstructor
public class SeatController implements AbstractController<SeatService, SeatDto> {

    private final SeatService seatService;


    @Override
    public SeatService getService() {
        return seatService;
    }





}
