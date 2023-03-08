package com.kodillalibrary.service;

import com.kodillalibrary.domain.BookTitle;
import com.kodillalibrary.repository.BookTitleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookTitleDbService {
    private final BookTitleRepository repository;

    public List<BookTitle> getAllBookTitles(){
        return repository.findAll();
    }
    public BookTitle addBookTitle(final BookTitle bookTitle){
        return repository.save(bookTitle);
    }
}
