package com.example.cinemaroommanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemaroommanagement.transformer.mapper.HallMapper;
import com.example.cinemaroommanagement.dto.HallDto;
import com.example.cinemaroommanagement.model.Hall;
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
