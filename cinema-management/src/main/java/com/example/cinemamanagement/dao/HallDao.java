package com.example.cinemamanagement.dao;

import com.example.cinemamanagement.model.Hall;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.cinemamanagement.dao.repo.HallRepo;

public interface HallDao extends AbstractDao<Hall, HallRepo> {
    // Define additional DAO methods here
}
