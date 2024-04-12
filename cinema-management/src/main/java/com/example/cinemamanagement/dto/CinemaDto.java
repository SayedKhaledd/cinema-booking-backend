package com.example.cinemamanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CinemaDto extends AbstractDto {
    private Long id;
    private String name;
    private String location;
    private List<HallDto> halls;

    public static CinemaDto getInstance(String name, String location) {
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setName(name);
        cinemaDto.setLocation(location);
        return cinemaDto;
    }

}
