package com.example.showtimemanagement.service;

import com.example.showtimemanagement.model.ShowTime;
import com.example.showtimemanagement.dto.ShowTimeDto;
import com.example.showtimemanagement.transformer.ShowTimeTransformer;
import com.example.showtimemanagement.dao.ShowTimeDao;
import com.example.backendcoreservice.service.AbstractService;

public interface ShowTimeService extends AbstractService<ShowTime, ShowTimeDto, ShowTimeTransformer, ShowTimeDao> {

}
