package com.example.cinemamanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemamanagement.dao.repo.SeatRepo;

@Component
@AllArgsConstructor
public class SeatDaoImpl implements SeatDao {

    private final SeatRepo seatRepo;

    @Override
    public SeatRepo getRepo() {
        return seatRepo;
    }


}
