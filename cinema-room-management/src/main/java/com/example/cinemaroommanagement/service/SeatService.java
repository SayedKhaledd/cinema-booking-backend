package com.example.cinemaroommanagement.service;

import com.example.cinemaroommanagement.model.Seat;
import com.example.cinemaroommanagement.dto.SeatDto;
import com.example.cinemaroommanagement.transformer.SeatTransformer;
import com.example.cinemaroommanagement.dao.SeatDao;
import com.example.backendcoreservice.service.AbstractService;

public interface SeatService extends AbstractService<Seat, SeatDto, SeatTransformer, SeatDao> {

}
