package com.example.cinemamanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemamanagement.transformer.mapper.HallMapper;
import com.example.cinemamanagement.dto.HallDto;
import com.example.cinemamanagement.model.Hall;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class HallTransformer implements AbstractTransformer<Hall, HallDto, HallMapper> {

    private final HallMapper hallMapper;

    @Override
    public HallMapper getMapper() {
        return hallMapper;
    }


}
