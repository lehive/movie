package com.lehive.movie.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Actor {
    private String firstName;
    private String lastName;
}
