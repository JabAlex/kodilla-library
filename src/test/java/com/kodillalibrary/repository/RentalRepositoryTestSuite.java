package com.kodillalibrary.repository;

import com.kodillalibrary.domain.Rental;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class RentalRepositoryTestSuite {

    @Autowired
    private RentalRepository rentalRepository;

    @Test
    void testRentalRepositorySave(){
        //Given
        Rental Rental = new Rental(1, 1, LocalDate.of(2023, 01, 01), LocalDate.of(2023, 02, 02));
        //When
        rentalRepository.save(Rental);
        //Then
        long id = Rental.getId();
        Optional<Rental> readReader = rentalRepository.findById(id);
        assertTrue(readReader.isPresent());
        //CleanUp
        rentalRepository.deleteById(id);
    }
}