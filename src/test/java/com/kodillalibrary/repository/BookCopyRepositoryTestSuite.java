package com.kodillalibrary.repository;

import com.kodillalibrary.domain.BookCopy;
import com.kodillalibrary.domain.BookCopyStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BookCopyRepositoryTestSuite {

    @Autowired
    private BookCopyRepository bookCopyRepository;

    @Test
    void testBookCopyRepositorySave(){
        //Given
        BookCopy bookCopy = new BookCopy(1, BookCopyStatus.AVAILABLE);
        //When
        bookCopyRepository.save(bookCopy);
        //Then
        long id = bookCopy.getId();
        Optional<BookCopy> readBookCopy = bookCopyRepository.findById(id);
        assertTrue(readBookCopy.isPresent());
        //CleanUp
        bookCopyRepository.deleteById(id);
    }
}
