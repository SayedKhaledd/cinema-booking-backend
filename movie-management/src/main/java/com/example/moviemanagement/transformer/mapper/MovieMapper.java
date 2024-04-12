package com.example.moviemanagement.transformer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.InjectionStrategy;
import com.example.moviemanagement.dto.MovieDto;
import com.example.moviemanagement.model.Movie;
import com.example.backendcoreservice.transformer.mapper.AbstractMapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MovieMapper extends AbstractMapper<Movie, MovieDto> {


}
