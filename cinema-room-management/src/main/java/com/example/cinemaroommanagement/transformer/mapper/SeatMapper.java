package com.example.cinemaroommanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.cinemaroommanagement.dto.SeatDto;
import com.example.cinemaroommanagement.model.Seat;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface SeatMapper extends AbstractMapper<Seat, SeatDto> {


}
