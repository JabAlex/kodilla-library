package com.kodillalibrary.controller;

import com.kodillalibrary.domain.BookTitle;
import com.kodillalibrary.domain.BookTitleDto;
import com.kodillalibrary.mapper.BookTitleMapper;
import com.kodillalibrary.service.BookTitleDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("1/titles")
@CrossOrigin("*")
@RequiredArgsConstructor
public class BookTitleController {

    private final BookTitleDbService service;
    private final BookTitleMapper bookTitleMapper;

    @GetMapping
    public ResponseEntity<List<BookTitleDto>> getBookTitles(){
        List<BookTitle> bookTitles = service.getAllBookTitles();
        return ResponseEntity.ok(bookTitleMapper.mapToBookTitleDtoList(bookTitles));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addBookTitle(@RequestBody BookTitleDto bookTitleDto){
        BookTitle bookTitle = bookTitleMapper.mapToBookTitle(bookTitleDto);
        service.addBookTitle(bookTitle);
        return ResponseEntity.ok().build();
    }
}
