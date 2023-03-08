package com.kodillalibrary.mapper;

import com.kodillalibrary.domain.BookCopyDto;
import com.kodillalibrary.domain.BookTitle;
import com.kodillalibrary.domain.BookTitleDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTitleMapper {

    public BookTitle mapToBookTitle(BookTitleDto bookTitleDto){
        return new BookTitle(
                bookTitleDto.getId(),
                bookTitleDto.getTitle(),
                bookTitleDto.getAuthor(),
                bookTitleDto.getPublicationYear()
        );
    }
    public BookTitleDto mapToBookTitleDto(BookTitle bookTitle){
        return new BookTitleDto(
                bookTitle.getId(),
                bookTitle.getTitle(),
                bookTitle.getAuthor(),
                bookTitle.getPublicationYear()
        );
    }
    public List<BookTitleDto> mapToBookTitleDtoList(List<BookTitle> bookTitleList){
        return bookTitleList.stream()
                .map(this::mapToBookTitleDto)
                .toList();
    }
}
