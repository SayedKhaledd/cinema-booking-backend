package com.example.cinemaroommanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemaroommanagement.transformer.mapper.SeatMapper;
import com.example.cinemaroommanagement.dto.SeatDto;
import com.example.cinemaroommanagement.model.Seat;
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
