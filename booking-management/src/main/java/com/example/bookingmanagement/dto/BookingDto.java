package com.example.bookingmanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import com.example.bookingmanagement.enums.BookingStatus;
import com.example.cinemamanagement.dto.SeatDto;
import com.example.showtimemanagement.dto.ShowTimeDto;
import com.example.usermanagement.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingDto extends AbstractDto {
    private Long id;

    private Long userId;

    private User user;

    private Long showTimeId;

    private ShowTimeDto showTime;

    private LocalDateTime bookingTime;

    private BookingStatus status;

    private Long seatId;

    private SeatDto seat;

}
