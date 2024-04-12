package com.example.cinemamanagement.service;

import com.example.cinemamanagement.model.Cinema;
import com.example.cinemamanagement.dto.CinemaDto;
import com.example.cinemamanagement.transformer.CinemaTransformer;
import com.example.cinemamanagement.dao.CinemaDao;
import com.example.backendcoreservice.service.AbstractService;

public interface CinemaService extends AbstractService<Cinema, CinemaDto, CinemaTransformer, CinemaDao> {

}
