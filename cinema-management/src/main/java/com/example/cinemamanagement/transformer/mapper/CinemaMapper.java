package com.example.cinemamanagement.transformer.mapper;

import com.example.backendcoreservice.transformer.mapper.AbstractMapper;
import com.example.cinemamanagement.dto.CinemaDto;
import com.example.cinemamanagement.model.Cinema;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        uses = {HallMapper.class})
public interface CinemaMapper extends AbstractMapper<Cinema, CinemaDto> {


}
