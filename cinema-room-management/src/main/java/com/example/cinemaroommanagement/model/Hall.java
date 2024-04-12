package com.example.cinemaroommanagement.model;

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
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "number_of_rows", nullable = false)
    private Integer numberOfRows;

    @Column(name = "number_of_seats_in_row", nullable = false)
    private Integer numberOfSeatsInRow;

    @Column(name = "number_of_seats", nullable = false)
    private Integer numberOfSeats;

    @JoinColumn(name = "cinema_id", nullable = false)
    private Long cinemaId;

    @JoinColumn(name = "cinema_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne
    @ToStringExclude
    @JsonIgnore
    private Cinema cinema;
}
