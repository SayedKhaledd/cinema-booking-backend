package com.example.cinemamanagement.model;

import com.example.backendcoreservice.model.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringExclude;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "hall")
public class Hall extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hall_id_sequence")
    @SequenceGenerator(name = "hall_id_sequence", sequenceName = "hall_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "number_of_rows", nullable = false)
    private Integer numberOfRows;

    @Column(name = "number_of_seats_in_row", nullable = false)
    private Integer numberOfSeatsInRow;

    @Column(name = "number_of_seats", nullable = false)
    private Integer numberOfSeats;

    @Column(name = "cinema_id", nullable = false)
    private Long cinemaId;

    @JoinColumn(name = "cinema_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne
    @ToStringExclude
    @JsonIgnore
    private Cinema cinema;
}
