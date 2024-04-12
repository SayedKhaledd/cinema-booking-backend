package com.example.cinemamanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemamanagement.transformer.mapper.CinemaMapper;
import com.example.cinemamanagement.dto.CinemaDto;
import com.example.cinemamanagement.model.Cinema;
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
