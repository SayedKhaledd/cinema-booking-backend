package com.example.showtimemanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.showtimemanagement.dto.ShowTimeDto;
import com.example.showtimemanagement.model.ShowTime;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ShowTimeMapper extends AbstractMapper<ShowTime, ShowTimeDto> {


}
