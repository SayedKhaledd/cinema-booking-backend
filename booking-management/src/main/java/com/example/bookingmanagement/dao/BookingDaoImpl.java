package com.example.bookingmanagement.dao;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.bookingmanagement.dao.repo.BookingRepo;

@Component
@AllArgsConstructor
public class BookingDaoImpl implements BookingDao {

    private final BookingRepo bookingRepo;

    @Override
    public BookingRepo getRepo() {
        return bookingRepo;
    }


}
