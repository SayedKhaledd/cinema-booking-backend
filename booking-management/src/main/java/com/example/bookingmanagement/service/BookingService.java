package com.example.bookingmanagement.service;

import com.example.bookingmanagement.model.Booking;
import com.example.bookingmanagement.dto.BookingDto;
import com.example.bookingmanagement.transformer.BookingTransformer;
import com.example.bookingmanagement.dao.BookingDao;
import com.example.backendcoreservice.service.AbstractService;

public interface BookingService extends AbstractService<Booking, BookingDto, BookingTransformer, BookingDao> {

}
