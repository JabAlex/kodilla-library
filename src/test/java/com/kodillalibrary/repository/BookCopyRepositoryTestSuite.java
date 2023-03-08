package com.kodillalibrary.repository;

import com.kodillalibrary.domain.BookCopy;
import com.kodillalibrary.domain.BookCopyStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BookCopyRepositoryTestSuite {

    @Autowired
    private BookCopyRepository bookCopyRepository;

//    @Test
//    void testBookCopyRepositorySave(){
//        //Given
//        BookCopy bookCopy = new BookCopy(1, 1, BookCopyStatus.AVAILABLE);
//        //When
//        bookCopyRepository.save(bookCopy);
//        //Then
//        long id = bookCopy.getId();
//        Optional<BookCopy> readBookCopy = bookCopyRepository.findById(id);
//        assertTrue(readBookCopy.isPresent());
//        //CleanUp
//        bookCopyRepository.deleteById(id);
//    }
    @Test
    void testFindByBookCopyStatus(){
        //Given
        BookCopy bookCopy1 = new BookCopy(1, 2, BookCopyStatus.AVAILABLE);
        BookCopy bookCopy2 = new BookCopy(1, 3, BookCopyStatus.AVAILABLE);
        BookCopy bookCopy3 = new BookCopy(1, 1, BookCopyStatus.RENTED);
        BookCopy bookCopy4 = new BookCopy(1, 4, BookCopyStatus.DESTROYED);
        //When
        bookCopyRepository.save(bookCopy1);
        bookCopyRepository.save(bookCopy2);
        bookCopyRepository.save(bookCopy3);
        bookCopyRepository.save(bookCopy4);
        //Then
        List<BookCopy> availableBookCopies = bookCopyRepository.findByBookCopyStatus(BookCopyStatus.AVAILABLE);
        assertEquals(2, availableBookCopies.size());
        //CleanUp
        bookCopyRepository.deleteAll();
    }
}
