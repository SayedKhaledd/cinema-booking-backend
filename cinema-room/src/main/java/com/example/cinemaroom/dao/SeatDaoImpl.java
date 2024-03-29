package com.example.cinemaroom.dao;

import com.example.cinemaroom.dao.repo.SeatRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SeatDaoImpl implements SeatDao {
    private final SeatRepo seatRepo;

    @Override
    public SeatRepo getRepo() {
        return seatRepo;
    }
}
