package com.example.moviemanagement.transformer;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import com.example.moviemanagement.transformer.mapper.MovieMapper;
import com.example.moviemanagement.dto.MovieDto;
import com.example.moviemanagement.model.Movie;
import com.example.backendcoreservice.transformer.AbstractTransformer;

@Component
@AllArgsConstructor
public class MovieTransformer implements AbstractTransformer<Movie, MovieDto, MovieMapper> {

    private final MovieMapper movieMapper;

    @Override
    public MovieMapper getMapper() {
        return movieMapper;
    }


}
