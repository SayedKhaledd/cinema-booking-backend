package com.example.cinemaroommanagement.dao;

import com.example.cinemaroommanagement.model.Cinema;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.cinemaroommanagement.dao.repo.CinemaRepo;

public interface CinemaDao extends AbstractDao<Cinema, CinemaRepo> {
    // Define additional DAO methods here
}
