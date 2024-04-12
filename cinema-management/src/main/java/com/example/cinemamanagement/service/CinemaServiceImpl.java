package com.example.cinemamanagement.service;

import com.example.cinemamanagement.dao.CinemaDao;
import com.example.cinemamanagement.dto.CinemaDto;
import com.example.cinemamanagement.transformer.CinemaTransformer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<CinemaDto> findAll() {
        return getTransformer().transformEntitiesToDtos(getDao().findAll());
    }
}
