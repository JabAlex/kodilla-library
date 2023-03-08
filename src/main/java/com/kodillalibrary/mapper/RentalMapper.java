package com.kodillalibrary.mapper;

import com.kodillalibrary.domain.Rental;
import com.kodillalibrary.domain.RentalDto;
import org.springframework.stereotype.Service;

@Service
public class RentalMapper {

    public Rental mapToRental(RentalDto rentalDto){
        return new Rental(
                rentalDto.getId(),
                rentalDto.getBookCopyId(),
                rentalDto.getReaderId()
        );
    }
    public RentalDto mapToRentalDto(Rental rental){
        return new RentalDto(
                rental.getId(),
                rental.getBookCopyId(),
                rental.getReaderId(),
                rental.getRentalStartDate(),
                rental.getReturnDate()
        );
    }
}
