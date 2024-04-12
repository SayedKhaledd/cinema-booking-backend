package com.example.cinemaroommanagement.service;

import com.example.cinemaroommanagement.model.Cinema;
import com.example.cinemaroommanagement.dto.CinemaDto;
import com.example.cinemaroommanagement.transformer.CinemaTransformer;
import com.example.cinemaroommanagement.dao.CinemaDao;
import com.example.backendcoreservice.service.AbstractService;

public interface CinemaService extends AbstractService<Cinema, CinemaDto, CinemaTransformer, CinemaDao> {

}
