package com.example.cinemaroom.service;

import com.example.cinemaroom.dao.SeatDao;
import com.example.cinemaroom.transformer.SeatTransformer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SeatServiceImpl implements SeatService {
    private final SeatDao seatDao;
    private final SeatTransformer seatTransformer;

    @Override
    public SeatDao getDao() {
        return seatDao;
    }

    @Override
    public SeatTransformer getTransformer() {
        return seatTransformer;
    }


}
