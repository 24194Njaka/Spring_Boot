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
}