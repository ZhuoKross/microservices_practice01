package com.microservice.booking.service;


import com.microservice.booking.DTO.BookingDTO;
import com.microservice.booking.Entity.Booking;
import com.microservice.booking.repository.BookingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }


    public List<BookingDTO> getAllBookings(){
        try {
            List<Booking> bookingListEntity =  bookingRepository.findAll();

            List<BookingDTO> bookingDTOList = bookingListEntity.stream()
                    .map((booking) -> BookingDTO.builder()
                            .startDate(booking.startDate)
                            .endDate(booking.endDate)
                            .idHost(booking.idHost)
                            .build()
                    ).toList();

            return bookingDTOList;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public BookingDTO getBooking(Long idBooking){
        try {
            Booking bookingFound = bookingRepository.findById(idBooking).orElse(null);

            BookingDTO bookingDTO = BookingDTO.builder()
                    .startDate(bookingFound.startDate)
                    .endDate(bookingFound.endDate)
                    .idHost(bookingFound.idHost)
                    .build();

            return bookingDTO;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
