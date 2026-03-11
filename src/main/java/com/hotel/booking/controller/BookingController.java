package com.hotel.booking.controller;

import com.hotel.booking.model.Booking;
import com.hotel.booking.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService = new BookingService();

    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }

    @PostMapping
    public List<Booking> addBooking(@RequestBody Booking booking) {
        if (booking.getRoomNumber() < 1 || booking.getRoomNumber() > 9) {
            throw new RuntimeException("Le numéro de chambre doit être compris entre 1 et 9.");
        }
        return bookingService.addBooking(booking);
    }
}