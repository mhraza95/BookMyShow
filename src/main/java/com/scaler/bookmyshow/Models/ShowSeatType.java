package com.scaler.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType extends BaseModel{

    private Show show;
    private ShowSeatType showSeatType;
    private int price;

}
