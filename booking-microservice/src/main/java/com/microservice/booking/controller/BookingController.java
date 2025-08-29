package com.microservice.booking.controller;

import com.microservice.booking.DTO.BookingDTO;
import com.microservice.booking.Entity.Booking;
import com.microservice.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {


    BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<BookingDTO>> getAllBookings (){
        List<BookingDTO> bookingList = bookingService.getAllBookings();
        return ResponseEntity.ok(bookingList);
    };

    @GetMapping("/{id}")
    public ResponseEntity<BookingDTO> getBooking (@PathVariable Long id){
        BookingDTO bookingDTO = bookingService.getBooking(id);

        return ResponseEntity.ok(bookingDTO);
    }
}
