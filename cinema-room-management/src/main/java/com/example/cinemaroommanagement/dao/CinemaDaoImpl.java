package com.example.cinemaroommanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemaroommanagement.dao.repo.CinemaRepo;

@Component
@AllArgsConstructor
public class CinemaDaoImpl implements CinemaDao {

    private final CinemaRepo cinemaRepo;

    @Override
    public CinemaRepo getRepo() {
        return cinemaRepo;
    }


}
