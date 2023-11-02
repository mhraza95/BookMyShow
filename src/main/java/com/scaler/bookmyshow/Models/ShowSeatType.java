package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;

    @ManyToOne
    private ShowSeatType showSeatType;
    private int price;

}
/*

ShowSeatType   ---- Show
 */