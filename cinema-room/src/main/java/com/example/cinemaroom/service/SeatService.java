package com.example.cinemaroom.service;

import com.example.backendcoreservice.service.AbstractService;
import com.example.cinemaroom.dao.SeatDao;
import com.example.cinemaroom.dto.SeatDto;
import com.example.cinemaroom.model.Seat;
import com.example.cinemaroom.transformer.SeatTransformer;

public interface SeatService extends AbstractService<Seat, SeatDto, SeatTransformer, SeatDao> {
}
