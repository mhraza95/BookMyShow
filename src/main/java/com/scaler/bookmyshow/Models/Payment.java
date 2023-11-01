package com.scaler.bookmyshow.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{

    private int amount;
    private PaymentMode paymentMode;
    private String refID;
    private PaymentStatus paymentStatus;
    private PaymentProvider paymentProvider;
}
