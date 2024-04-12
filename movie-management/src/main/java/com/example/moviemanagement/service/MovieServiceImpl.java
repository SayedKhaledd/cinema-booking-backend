package com.example.moviemanagement.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.moviemanagement.dao.MovieDao;
import com.example.moviemanagement.transformer.MovieTransformer;

@Slf4j
@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieDao movieDao;
    private final MovieTransformer movieTransformer;

    @Override
    public MovieDao getDao() {
        return movieDao;
    }

    @Override
    public MovieTransformer getTransformer() {
        return movieTransformer;
    }
    



}
