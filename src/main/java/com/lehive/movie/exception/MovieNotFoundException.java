package com.lehive.movie.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(String exception) {
        super(exception);
    }
}
