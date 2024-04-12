package com.example.showtimemanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import com.example.cinemamanagement.dto.HallDto;
import com.example.moviemanagement.dto.MovieDto;
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

    private MovieDto movie;

    private Long hallId;


    private HallDto hall;

    private Integer price;
}
