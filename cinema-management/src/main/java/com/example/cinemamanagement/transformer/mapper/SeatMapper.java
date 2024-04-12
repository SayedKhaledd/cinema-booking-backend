package com.example.cinemamanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.cinemamanagement.dto.SeatDto;
import com.example.cinemamanagement.model.Seat;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SeatMapper extends AbstractMapper<Seat, SeatDto> {


}
