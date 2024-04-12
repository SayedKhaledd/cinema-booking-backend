package com.example.cinemaroommanagement.dao;

import com.example.cinemaroommanagement.model.Seat;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.cinemaroommanagement.dao.repo.SeatRepo;

public interface SeatDao extends AbstractDao<Seat, SeatRepo> {
    // Define additional DAO methods here
}
