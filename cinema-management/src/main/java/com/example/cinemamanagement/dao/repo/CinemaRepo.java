package com.example.cinemamanagement.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cinemamanagement.model.Cinema;

import java.util.List;

@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Long> {

    List<Cinema> findAllByMarkedAsDeletedFalse();
}
