package com.example.cinemaroommanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemaroommanagement.transformer.mapper.CinemaMapper;
import com.example.cinemaroommanagement.dto.CinemaDto;
import com.example.cinemaroommanagement.model.Cinema;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class CinemaTransformer implements AbstractTransformer<Cinema, CinemaDto, CinemaMapper> {

    private final CinemaMapper cinemaMapper;

    @Override
    public CinemaMapper getMapper() {
        return cinemaMapper;
    }


}
