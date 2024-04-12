package com.example.showtimemanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import com.example.cinemamanagement.model.Hall;
import com.example.moviemanagement.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShowTimeDto extends AbstractDto {

    private Long id;

    private LocalDateTime time;

    private Long movieId;

    private Movie movie;

    private Long hallId;


    private Hall hall;

    private Integer price;
}
