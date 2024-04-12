package com.example.showtimemanagement.dao;

import com.example.showtimemanagement.model.ShowTime;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.showtimemanagement.dao.repo.ShowTimeRepo;

public interface ShowTimeDao extends AbstractDao<ShowTime, ShowTimeRepo> {
    // Define additional DAO methods here
}
