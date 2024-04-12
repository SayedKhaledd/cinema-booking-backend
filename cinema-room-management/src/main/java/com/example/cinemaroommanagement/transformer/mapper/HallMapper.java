package com.example.cinemaroommanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.cinemaroommanagement.dto.HallDto;
import com.example.cinemaroommanagement.model.Hall;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface HallMapper extends AbstractMapper<Hall, HallDto> {


}
