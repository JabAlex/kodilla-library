package com.kodillalibrary.controller;

import com.kodillalibrary.domain.BookCopy;
import com.kodillalibrary.domain.BookCopyDto;
import com.kodillalibrary.domain.BookCopyStatus;
import com.kodillalibrary.domain.BookCopyStatusDto;
import com.kodillalibrary.mapper.BookCopyMapper;
import com.kodillalibrary.service.BookCopyDbService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("1/copies")
@CrossOrigin("*")
@RequiredArgsConstructor
public class BookCopyController {

    private final BookCopyDbService service;
    private final BookCopyMapper bookCopyMapper;

    @GetMapping(value = "{titleId}")
    public ResponseEntity<Integer> getNumberOfCopies(@PathVariable long titleId){
        List<BookCopy> bookCopyListByTitleId = service.getBookCopyListByTitleId(titleId);
        return ResponseEntity.ok(bookCopyListByTitleId.size());
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addBookCopy(@RequestBody BookCopyDto bookCopyDto){
        BookCopy bookCopy = bookCopyMapper.mapToBookCopy(bookCopyDto);
        service.addBookCopy(bookCopy);
        return ResponseEntity.ok().build();
    }
    @PutMapping()
    public ResponseEntity<BookCopyDto> changeBookCopyStatus(@RequestBody BookCopyStatusDto bookCopyStatusDto){
        BookCopy bookCopy = service.getBookCopy(bookCopyStatusDto.getCopyId());
        bookCopy.setBookCopyStatus(bookCopyStatusDto.getBookCopyStatus());
        service.addBookCopy(bookCopy);
        return ResponseEntity.ok(bookCopyMapper.mapToBookCopyDto(bookCopy));
    }

}
