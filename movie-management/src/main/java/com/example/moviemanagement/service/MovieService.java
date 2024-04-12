package com.example.moviemanagement.service;

import com.example.moviemanagement.model.Movie;
import com.example.moviemanagement.dto.MovieDto;
import com.example.moviemanagement.transformer.MovieTransformer;
import com.example.moviemanagement.dao.MovieDao;
import com.example.backendcoreservice.service.AbstractService;

public interface MovieService extends AbstractService<Movie, MovieDto, MovieTransformer, MovieDao> {

}
