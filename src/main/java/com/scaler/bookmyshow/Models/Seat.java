package com.scaler.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Seat extends BaseModel{

    private String number;
    private int rowVal;
    private int rowCol;
    private SeatType seatType;
}
