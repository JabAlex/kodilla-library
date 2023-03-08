package com.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class RentalDto {
    private long id;
    private long bookCopyId;
    private long readerId;
    private LocalDate rentalStartDate;
    private LocalDate returnDate;
}
