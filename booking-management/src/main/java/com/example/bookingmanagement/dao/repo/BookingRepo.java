package com.example.bookingmanagement.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bookingmanagement.model.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

}
