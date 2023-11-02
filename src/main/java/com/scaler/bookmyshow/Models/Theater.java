package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theater extends BaseModel{

    private String name;

    @OneToMany
    private List<Screen> screens;
}

//     1    -        M
// Theater ----  Screens -. 1:M
//     1             1