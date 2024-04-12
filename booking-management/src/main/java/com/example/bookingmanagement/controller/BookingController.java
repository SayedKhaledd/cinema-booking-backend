package com.example.bookingmanagement.controller;

import com.example.backendcoreservice.api.ApiResponseBuilder;
import com.example.backendcoreservice.controller.AbstractController;
import com.example.bookingmanagement.dto.BookingDto;
import com.example.bookingmanagement.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/booking")
@AllArgsConstructor
public class BookingController implements AbstractController<BookingService, BookingDto> {

    private final BookingService bookingService;
    private final ApiResponseBuilder<BookingDto> apiResponseBuilder;


    @Override
    public BookingService getService() {
        return bookingService;
    }

    @Override
    public ApiResponseBuilder<BookingDto> getApiResponseBuilder() {
        return apiResponseBuilder;
    }
}
