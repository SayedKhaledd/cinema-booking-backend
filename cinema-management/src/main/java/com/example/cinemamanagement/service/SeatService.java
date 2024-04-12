package com.example.cinemamanagement.service;

import com.example.cinemamanagement.model.Seat;
import com.example.cinemamanagement.dto.SeatDto;
import com.example.cinemamanagement.transformer.SeatTransformer;
import com.example.cinemamanagement.dao.SeatDao;
import com.example.backendcoreservice.service.AbstractService;

public interface SeatService extends AbstractService<Seat, SeatDto, SeatTransformer, SeatDao> {

}
