package com.example.cinemaroom.transformer;

import com.example.backendcoreservice.transformer.AbstractTransformer;
import com.example.cinemaroom.dto.SeatDto;
import com.example.cinemaroom.model.Seat;
import com.example.cinemaroom.transformer.mapper.SeatMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SeatTransformer implements AbstractTransformer<Seat, SeatDto, SeatMapper> {
    private final SeatMapper seatMapper;

    @Override
    public SeatMapper getMapper() {
        return seatMapper;
    }
}
