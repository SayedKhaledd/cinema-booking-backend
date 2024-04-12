package com.example.bookingmanagement.model;

import com.example.backendcoreservice.model.AbstractEntity;
import com.example.bookingmanagement.enums.BookingStatus;
import com.example.cinemamanagement.model.Seat;
import com.example.showtimemanagement.model.ShowTime;
import com.example.usermanagement.model.User;
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
@Table(name = "booking")
public class Booking extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "booking_id_sequence")
    @SequenceGenerator(name = "booking_id_sequence", sequenceName = "booking_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @JoinColumn(name = "user_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne
    private User user;

    @Column(name = "show_time_id", nullable = false)
    private Long showTimeId;

    @JoinColumn(name = "show_time_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne
    private ShowTime showTime;

    @Column(name = "booking_time", nullable = false)
    private LocalDateTime bookingTime;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @Column(name = "seat_id", nullable = false)
    private Long seatId;

    @JoinColumn(name = "seat_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne
    private Seat seat;
}
