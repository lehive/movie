package com.lehive.movie.service;

import com.lehive.movie.entity.Movie;
import com.lehive.movie.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Iterable<Movie> saveMovieList(List<Movie> movies) {
        return movieRepository.saveAll(movies);
    }
}
