package com.example.bookingmanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.bookingmanagement.dto.BookingDto;
import com.example.bookingmanagement.model.Booking;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BookingMapper extends AbstractMapper<Booking, BookingDto> {


}
