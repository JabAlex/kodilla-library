package com.kodillalibrary.repository;

import com.kodillalibrary.domain.Reader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ReaderRepositoryTestSuite {

    @Autowired
    private ReaderRepository readerRepository;

    @Test
    void testReaderRepositorySave(){
        //Given
        Reader reader = new Reader("John", "Test", LocalDate.of(2002, 02, 02));
        //When
        readerRepository.save(reader);
        //Then
        long id = reader.getId();
        Optional<Reader> readReader = readerRepository.findById(id);
        assertTrue(readReader.isPresent());
        //CleanUp
        readerRepository.deleteById(id);
    }
}
