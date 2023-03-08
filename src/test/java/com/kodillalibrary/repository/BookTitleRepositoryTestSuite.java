package com.kodillalibrary.repository;

import com.kodillalibrary.domain.BookTitle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BookTitleRepositoryTestSuite {

    @Autowired
    private BookTitleRepository bookTitleRepository;

    @Test
    void testBookTitleRepositorySave(){
        //Given
        BookTitle bookTitle = new BookTitle(1,"test book", "test author", 2023);
        //When
        bookTitleRepository.save(bookTitle);
        //Then
        long id = bookTitle.getId();
        Optional<BookTitle> readBookTitle = bookTitleRepository.findById(id);
        assertTrue(readBookTitle.isPresent());
        //CleanUp
        bookTitleRepository.deleteById(id);
    }
}
