package com.example.cinemamanagement.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cinemamanagement.model.Cinema;

@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Long> {

}
