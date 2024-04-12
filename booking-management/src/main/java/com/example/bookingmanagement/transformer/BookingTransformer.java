package com.example.bookingmanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.bookingmanagement.transformer.mapper.BookingMapper;
import com.example.bookingmanagement.dto.BookingDto;
import com.example.bookingmanagement.model.Booking;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class BookingTransformer implements AbstractTransformer<Booking, BookingDto, BookingMapper> {

    private final BookingMapper bookingMapper;

    @Override
    public BookingMapper getMapper() {
        return bookingMapper;
    }


}
