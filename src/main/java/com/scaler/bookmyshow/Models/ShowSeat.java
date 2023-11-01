package com.scaler.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ShowSeat extends BaseModel{

    private Show show;
    private Seat seat;
    private ShowSeatStaus showSeatStaus;
}
