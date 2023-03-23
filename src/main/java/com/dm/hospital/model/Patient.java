package com.dm.hospital.model;

import lombok.Data;

@Data
public class Patient {

    private int id;
    private String firstName;
    private String lastName;

    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
