package com.example.moviemanagement.dao;

import com.example.moviemanagement.model.Movie;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.moviemanagement.dao.repo.MovieRepo;

public interface MovieDao extends AbstractDao<Movie, MovieRepo> {
    // Define additional DAO methods here
}
