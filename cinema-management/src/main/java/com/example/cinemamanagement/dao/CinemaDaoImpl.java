package com.example.cinemamanagement.dao;

import com.example.cinemamanagement.dao.repo.CinemaRepo;
import com.example.cinemamanagement.model.Cinema;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CinemaDaoImpl implements CinemaDao {

    private final CinemaRepo cinemaRepo;

    @Override
    public CinemaRepo getRepo() {
        return cinemaRepo;
    }

    @Override
    public List<Cinema> findAll() {
        return getRepo().findAllByMarkedAsDeletedFalse();
    }
}
