package com.kodillalibrary.mapper;

import com.kodillalibrary.domain.BookCopy;
import com.kodillalibrary.domain.BookCopyDto;
import org.springframework.stereotype.Service;

@Service
public class BookCopyMapper {

    public BookCopy mapToBookCopy(BookCopyDto bookCopyDto){
        return new BookCopy(
                bookCopyDto.getId(),
                bookCopyDto.getTitleId(),
                bookCopyDto.getBookCopyStatus()
        );
    }
    public BookCopyDto mapToBookCopyDto(BookCopy bookCopy){
        return new BookCopyDto(
                bookCopy.getId(),
                bookCopy.getTitleId(),
                bookCopy.getBookCopyStatus()
        );
    }
}
