package com.scaler.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel{

    private User user;
    private Show show;
    private List<ShowSeat> showSeats;
    private Date bookedAt;
    private BookingStatus bookingStatus;
    private double amount;
    private List<Payment> payments;
}
