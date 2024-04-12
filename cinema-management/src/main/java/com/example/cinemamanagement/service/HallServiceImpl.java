package com.example.cinemamanagement.service;

import com.example.cinemamanagement.dao.HallDao;
import com.example.cinemamanagement.dto.HallDto;
import com.example.cinemamanagement.transformer.HallTransformer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class HallServiceImpl implements HallService {

    private final HallDao hallDao;
    private final HallTransformer hallTransformer;

    @Override
    public HallDao getDao() {
        return hallDao;
    }

    @Override
    public HallTransformer getTransformer() {
        return hallTransformer;
    }

    //TODO: IMPLEMENT THIS
    @Override
    public List<HallDto> findAll() {
        return null;
    }
}
