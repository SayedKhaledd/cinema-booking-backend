package com.example.cinemaroom.model;

import com.example.backendcoreservice.model.AbstractEntity;
import com.example.cinemaroom.enums.SeatPosition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "seat")
public class Seat extends AbstractEntity {
    @Id
    @SequenceGenerator(name = "seat_id_seq", sequenceName = "seat_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seat_id_seq")
    private Long id;

    @Column(name = "cinema_room_id", updatable = false, nullable = false)
    @ManyToOne
    private CinemaRoom cinemaRoom;

    @Column(name = "cinema_room_id", insertable = false, updatable = false, nullable = false)
    private Long cinemaRoomId;

    @Column(name = "position", nullable = false)
    @Enumerated(EnumType.STRING)
    private SeatPosition position;

    @Column(name = "is_vip", nullable = false)
    private Boolean isVip;

    @Column(name = "is_occupied", nullable = false)
    private Boolean isOccupied;


}
