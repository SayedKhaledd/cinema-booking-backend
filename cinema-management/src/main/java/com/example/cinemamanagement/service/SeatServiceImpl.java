package com.example.cinemamanagement.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.cinemamanagement.dao.SeatDao;
import com.example.cinemamanagement.transformer.SeatTransformer;

@Slf4j
@Service
@AllArgsConstructor
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
