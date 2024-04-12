package com.example.cinemamanagement.dao;

import com.example.cinemamanagement.model.Seat;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.cinemamanagement.dao.repo.SeatRepo;

public interface SeatDao extends AbstractDao<Seat, SeatRepo> {
    // Define additional DAO methods here
}
