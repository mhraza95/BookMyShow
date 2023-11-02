package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    private String name;

    @ManyToMany
    private List<Actor> actors;
    private int duration;
    private List<Genre> genres;
}
