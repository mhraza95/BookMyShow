package com.scaler.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{

    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> showSeats;
    private Date bookedAt;
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    private double amount;
    @OneToMany
    private List<Payment> payments;
}

/*
    1           M
Booking ---- Payment -> 1:M
     1          1
 */
