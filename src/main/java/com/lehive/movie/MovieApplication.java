package com.lehive.movie;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lehive.movie.entity.Movie;
import com.lehive.movie.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
@SpringBootApplication
public class MovieApplication {

    public static final String JSON_MOVIES_COMPACT_JSON = "/json/movies-compact.json";

    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(MovieService movieService) {
        return args -> {
            TypeReference<List<Movie>> typeReference = new TypeReference<>() {
            };
            InputStream inputStream = TypeReference.class.getResourceAsStream(JSON_MOVIES_COMPACT_JSON);
            try {
                ObjectMapper mapper = new ObjectMapper();
                List<Movie> movies = mapper.readValue(inputStream, typeReference);
                movieService.saveMovieList(movies);
                log.info("Movies saved to H2 database");
            } catch (IOException e) {
                log.error("Unable to save movies: " + e.getMessage());
            }
        };
    }

}
