package com.example.cinemaroom.transformer.mapper;

import com.example.backendcoreservice.transformer.mapper.AbstractMapper;
import com.example.cinemaroom.dto.SeatDto;
import com.example.cinemaroom.model.Seat;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SeatMapper extends AbstractMapper<Seat, SeatDto> {
}
