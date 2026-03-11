package com.hotel.booking.service;

import com.hotel.booking.model.Booking;
import java.util.ArrayList;
import java.util.List;

public class BookingService {

    private final List<Booking> bookings = new ArrayList<>();

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Booking> addBooking(Booking booking) {
       for (Booking b : bookings) {
          if(b.getRoomNumber() ==  booking.getRoomNumber() &&
                  b.getBookingDate().equals(booking.getBookingDate())) {

              throw new RuntimeException("Chambre déjà réservée pour cette date ");
          }
       }
       bookings.add(booking);
        return bookings;
    }
}
