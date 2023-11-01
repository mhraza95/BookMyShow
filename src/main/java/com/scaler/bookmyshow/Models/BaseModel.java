package com.scaler.bookmyshow.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass //super class
public class BaseModel {

    @Id //PrimaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment
    private Long id;
    private Date createdAt;
    private Date lastModifiedAt;
}
