package com.example.moviemanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.moviemanagement.dao.repo.MovieRepo;

@Component
@AllArgsConstructor
public class MovieDaoImpl implements MovieDao {

    private final MovieRepo movieRepo;

    @Override
    public MovieRepo getRepo() {
        return movieRepo;
    }


}
