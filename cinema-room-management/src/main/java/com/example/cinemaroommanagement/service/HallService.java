package com.example.cinemaroommanagement.service;

import com.example.cinemaroommanagement.model.Hall;
import com.example.cinemaroommanagement.dto.HallDto;
import com.example.cinemaroommanagement.transformer.HallTransformer;
import com.example.cinemaroommanagement.dao.HallDao;
import com.example.backendcoreservice.service.AbstractService;

public interface HallService extends AbstractService<Hall, HallDto, HallTransformer, HallDao> {

}
