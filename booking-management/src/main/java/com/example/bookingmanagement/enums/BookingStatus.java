package com.example.bookingmanagement.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum BookingStatus {
    BOOKED("BOOKING"),
    CANCELLED("CANCELLED");
    @Setter
    private String status;
}
