package com.example.cinemamanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HallDto extends AbstractDto {
    private Long id;
    private String name;
    private Integer numberOfRows;
    private Integer numberOfSeatsInRow;
    private Integer numberOfSeats;
    private Long cinemaId;
    private CinemaDto cinema;
}
