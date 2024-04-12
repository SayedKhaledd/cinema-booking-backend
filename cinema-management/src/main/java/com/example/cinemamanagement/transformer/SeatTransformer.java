package com.example.cinemamanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemamanagement.transformer.mapper.SeatMapper;
import com.example.cinemamanagement.dto.SeatDto;
import com.example.cinemamanagement.model.Seat;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class SeatTransformer implements AbstractTransformer<Seat, SeatDto, SeatMapper> {

    private final SeatMapper seatMapper;

    @Override
    public SeatMapper getMapper() {
        return seatMapper;
    }


}
