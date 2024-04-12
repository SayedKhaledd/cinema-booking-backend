package com.example.showtimemanagement.model;

import com.example.backendcoreservice.model.AbstractEntity;
import com.example.cinemamanagement.model.Hall;
import com.example.moviemanagement.model.Movie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "show_time")
public class ShowTime extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "show_time_id_sequence")
    @SequenceGenerator(name = "show_time_id_sequence", sequenceName = "show_time_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "time", nullable = false)
    private LocalDateTime time;

    @Column(name = "movie_id", nullable = false)
    private Long movieId;

    @JoinColumn(name = "movie_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne
    private Movie movie;

    @Column(name = "hall_id", nullable = false)
    private Long hallId;

    @JoinColumn(name = "hall_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne
    private Hall hall;

    @Column(name = "price", nullable = false)
    private Integer price;


}
