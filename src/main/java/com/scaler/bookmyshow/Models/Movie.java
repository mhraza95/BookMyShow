package com.scaler.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Movie extends BaseModel{

    private String name;
    private List<Actor> actors;
    private int duration;
    private List<Genre> genres;
}
