package com.example.cinemamanagement.service;

import com.example.cinemamanagement.model.Hall;
import com.example.cinemamanagement.dto.HallDto;
import com.example.cinemamanagement.transformer.HallTransformer;
import com.example.cinemamanagement.dao.HallDao;
import com.example.backendcoreservice.service.AbstractService;

public interface HallService extends AbstractService<Hall, HallDto, HallTransformer, HallDao> {

}
