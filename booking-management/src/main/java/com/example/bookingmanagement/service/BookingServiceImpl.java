package com.example.bookingmanagement.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.bookingmanagement.dao.BookingDao;
import com.example.bookingmanagement.transformer.BookingTransformer;

@Slf4j
@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingDao bookingDao;
    private final BookingTransformer bookingTransformer;

    @Override
    public BookingDao getDao() {
        return bookingDao;
    }

    @Override
    public BookingTransformer getTransformer() {
        return bookingTransformer;
    }
    



}
