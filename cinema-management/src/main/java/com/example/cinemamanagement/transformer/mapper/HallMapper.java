package com.example.cinemamanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.cinemamanagement.dto.HallDto;
import com.example.cinemamanagement.model.Hall;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface HallMapper extends AbstractMapper<Hall, HallDto> {


}
