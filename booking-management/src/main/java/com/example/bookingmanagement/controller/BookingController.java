package com.example.bookingmanagement.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookingmanagement.dto.BookingDto;
import com.example.bookingmanagement.service.BookingService;
import com.example.backendcoreservice.controller.AbstractController;


@RestController
@RequestMapping("/api/booking")
@AllArgsConstructor
public class BookingController implements AbstractController<BookingService, BookingDto> {

    private final BookingService bookingService;


    @Override
    public BookingService getService() {
        return bookingService;
    }





}
