package com.example.cinemamanagement.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cinemamanagement.model.Hall;

@Repository
public interface HallRepo extends JpaRepository<Hall, Long> {

}
