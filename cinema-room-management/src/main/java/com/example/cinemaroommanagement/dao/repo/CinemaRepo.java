package com.example.cinemaroommanagement.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cinemaroommanagement.model.Cinema;

@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Long> {

}
