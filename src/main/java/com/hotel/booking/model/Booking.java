package com.hotel.booking.model;

import java.time.LocalDate;

public class Booking {
    private String clientName;
    private String phone;
    private String email;
    private int roomNumber;
    private String roomDescription;
    private LocalDate bookingDate;

    public Booking() {}

    public Booking(String clientName, String phone, String email,
                   int roomNumber, String roomDescription, LocalDate bookingDate) {
        this.clientName = clientName;
        this.phone = phone;
        this.email = email;
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.bookingDate = bookingDate;
    }
}
