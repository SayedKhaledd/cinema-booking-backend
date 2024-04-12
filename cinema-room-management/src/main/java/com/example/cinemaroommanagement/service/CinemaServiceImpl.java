package com.example.cinemaroommanagement.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.cinemaroommanagement.dao.CinemaDao;
import com.example.cinemaroommanagement.transformer.CinemaTransformer;

@Slf4j
@Service
@AllArgsConstructor
public class CinemaServiceImpl implements CinemaService {

    private final CinemaDao cinemaDao;
    private final CinemaTransformer cinemaTransformer;

    @Override
    public CinemaDao getDao() {
        return cinemaDao;
    }

    @Override
    public CinemaTransformer getTransformer() {
        return cinemaTransformer;
    }
    



}
