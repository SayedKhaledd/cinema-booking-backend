package com.example.cinemamanagement.model;

import com.example.backendcoreservice.model.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLSelect;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "cinema")
public class Cinema extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cinema_id_sequence")
    @SequenceGenerator(name = "cinema_id_sequence", sequenceName = "cinema_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "location", nullable = false)
    private String location;

//    @SQLSelect(sql = "SELECT COUNT(hall.id) FROM hall WHERE cinema_id = id")
//    private Integer numberOfHalls;

    @OneToMany(mappedBy = "cinema")
    private List<Hall> halls;


}
