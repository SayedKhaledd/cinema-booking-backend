package com.example.moviemanagement.model;

import com.example.backendcoreservice.model.AbstractEntity;
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
@Table(name = "movie")
public class Movie extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_id_sequence")
    @SequenceGenerator(name = "movie_id_sequence", sequenceName = "movie_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_date", nullable = false)
    private LocalDateTime releaseDate;

    @Column(name = "cover_image", nullable = false)
    private String coverImage;

    @Column(name = "duration", nullable = false)
    private Double duration;

    @Column(name = "rating", nullable = false)
    private Double rating;

}
