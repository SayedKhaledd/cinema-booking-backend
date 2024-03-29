package com.example.cinemaroom.model;

import com.example.backendcoreservice.model.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "cinema_room")
public class CinemaRoom extends AbstractEntity {
    @Id
    @SequenceGenerator(name = "cinema_room_id_seq", sequenceName = "cinema_room_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cinema_room_id_seq")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "number_of_rows", nullable = false)
    private Integer numberOfRows;

    @Column(name = "seats_per_row", nullable = false)
    private Integer seatsPerRow;

    @JoinColumn(name = "cinema_room_id", nullable = false)
    @OneToMany
    private List<Seat> seats;


}
