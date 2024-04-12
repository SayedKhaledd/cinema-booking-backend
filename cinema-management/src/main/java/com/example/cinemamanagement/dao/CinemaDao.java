package com.example.cinemamanagement.dao;

import com.example.cinemamanagement.model.Cinema;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.cinemamanagement.dao.repo.CinemaRepo;

import java.util.List;

public interface CinemaDao extends AbstractDao<Cinema, CinemaRepo> {

   List<Cinema> findAll();
}
