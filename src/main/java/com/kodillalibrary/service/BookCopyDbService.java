package com.kodillalibrary.service;

import com.kodillalibrary.domain.BookCopy;
import com.kodillalibrary.repository.BookCopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookCopyDbService {
    private final BookCopyRepository repository;

    public BookCopy addBookCopy(final BookCopy bookCopy){
        return repository.save(bookCopy);
    }
    public BookCopy getBookCopy(final long bookCopyId){
        return repository.findById(bookCopyId);
    }
    public List<BookCopy> getBookCopyListByTitleId(final long titleId){
        return repository.findAllByTitleId(titleId);
    }
}
