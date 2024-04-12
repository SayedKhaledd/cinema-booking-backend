package com.example.cinemaroommanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.cinemaroommanagement.dto.CinemaDto;
import com.example.cinemaroommanagement.model.Cinema;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CinemaMapper extends AbstractMapper<Cinema, CinemaDto> {


}
