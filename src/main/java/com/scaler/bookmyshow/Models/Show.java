package com.scaler.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Show extends BaseModel{

    private Movie movie;
    private Screen screen;
    private Date startTime;
    private List<Feature> features;

}
