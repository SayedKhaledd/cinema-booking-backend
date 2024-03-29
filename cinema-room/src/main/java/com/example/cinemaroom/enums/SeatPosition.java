package com.example.cinemaroom.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SeatPosition {
    LEFT("LEFT"), RIGHT("RIGHT"), MIDDLE("MIDDLE");
    private String position;

}
