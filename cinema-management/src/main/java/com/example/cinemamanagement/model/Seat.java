package com.example.cinemamanagement.model;

import com.example.backendcoreservice.model.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "seat")
public class Seat extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seat_id_sequence")
    @SequenceGenerator(name = "seat_id_sequence", sequenceName = "seat_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "seat_number", nullable = false)
    private String seatNumber;

    @Column(name = "row_number", nullable = false)
    private Integer rowNumber;

    @Column(name = "column_number", nullable = false)
    private Integer columnNumber;

    @Column(name = "is_vip", nullable = false)
    private Boolean isVip;

    @Column(name = "hall_id", nullable = false)
    private Long hallId;

    @JoinColumn(name = "hall_id", insertable = false, updatable = false, nullable = false)
    @ManyToOne
    private Hall hall;


}
