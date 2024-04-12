package com.example.cinemamanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import com.example.cinemamanagement.model.Hall;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SeatDto extends AbstractDto {
    private Long id;
    private String seatNumber;
    private Integer rowNumber;
    private Integer columnNumber;
    private Boolean isVip;
    private Long hallId;
    private Hall hall;
}
