package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    private ShowSeatStaus showSeatStaus;
}

/*
  1              1
ShowSeat  ---- Seat -> M:1
    M            1
 */