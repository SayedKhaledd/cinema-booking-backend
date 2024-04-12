package com.example.moviemanagement.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.moviemanagement.model.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {

}
