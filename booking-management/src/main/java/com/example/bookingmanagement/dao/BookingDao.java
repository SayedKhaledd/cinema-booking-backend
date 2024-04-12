package com.example.bookingmanagement.dao;

import com.example.bookingmanagement.model.Booking;
import com.example.backendcoreservice.dao.AbstractDao;
import com.example.bookingmanagement.dao.repo.BookingRepo;

public interface BookingDao extends AbstractDao<Booking, BookingRepo> {
    // Define additional DAO methods here
}
