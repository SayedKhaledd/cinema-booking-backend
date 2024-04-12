package com.example.cinemaroommanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.cinemaroommanagement.dao.repo.SeatRepo;

@Component
@AllArgsConstructor
public class SeatDaoImpl implements SeatDao {

    private final SeatRepo seatRepo;

    @Override
    public SeatRepo getRepo() {
        return seatRepo;
    }


}
