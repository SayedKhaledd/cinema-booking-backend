package com.example.cinemaroom.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import com.example.cinemaroom.enums.SeatPosition;
import com.example.cinemaroom.model.CinemaRoom;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatDto extends AbstractDto {
    private Long id;
    private CinemaRoom cinemaRoom;
    private Long cinemaRoomId;
    private SeatPosition position;
    private Boolean isVip;
    private Boolean isOccupied;
}
