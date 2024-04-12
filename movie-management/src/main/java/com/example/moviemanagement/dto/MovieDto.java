package com.example.moviemanagement.dto;

import com.example.backendcoreservice.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDto extends AbstractDto {
    private Long id;

    private String title;

    private String description;

    private LocalDateTime releaseDate;

    private String coverImage;

    private Double duration;

    private Double rating;

}