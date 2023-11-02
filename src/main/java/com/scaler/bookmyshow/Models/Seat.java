package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{

    private String number;
    private int rowVal;
    private int rowCol;
    private SeatType seatType;
}
