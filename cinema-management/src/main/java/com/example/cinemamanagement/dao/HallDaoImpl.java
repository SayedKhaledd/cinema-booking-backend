package com.example.cinemamanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemamanagement.dao.repo.HallRepo;

@Component
@AllArgsConstructor
public class HallDaoImpl implements HallDao {

    private final HallRepo hallRepo;

    @Override
    public HallRepo getRepo() {
        return hallRepo;
    }


}
