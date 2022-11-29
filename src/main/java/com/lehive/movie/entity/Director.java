package com.lehive.movie.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Director {

    private String firstName;
    private String lastName;
}
