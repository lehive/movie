package com.lehive.movie.controller;

import com.lehive.movie.entity.Movie;
import com.lehive.movie.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movie")
    public Movie create(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @GetMapping("/movie")
    public Iterable<Movie> read() {
        return movieService.findAllMovies();
    }

    @GetMapping("/movie/{id}")
    Optional<Movie> findById(@PathVariable Integer id) {
        return movieService.findById(id);
    }

    @DeleteMapping("/movie/delete/{id}")
    public void deleteMovieById(@PathVariable Long id) {
        movieService.deleteMovieById(id);
    }

}
