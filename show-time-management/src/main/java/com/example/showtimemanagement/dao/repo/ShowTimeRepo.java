package com.example.showtimemanagement.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.showtimemanagement.model.ShowTime;

@Repository
public interface ShowTimeRepo extends JpaRepository<ShowTime, Long> {

}
