package com.kodillalibrary.controller;

import com.kodillalibrary.domain.Reader;
import com.kodillalibrary.domain.ReaderDto;
import com.kodillalibrary.mapper.ReaderMapper;
import com.kodillalibrary.service.ReaderDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("1/readers")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ReaderController {

    private final ReaderDbService service;
    private final ReaderMapper readerMapper;

    @GetMapping
    public ResponseEntity<List<ReaderDto>> getReaders(){
        List<Reader> readers = service.getAllReaders();
        return ResponseEntity.ok(readerMapper.mapToReaderDtoList(readers));
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addUser(@RequestBody ReaderDto readerDto){
        Reader reader = readerMapper.mapToReader(readerDto);
        service.addReader(reader);
        return ResponseEntity.ok().build();
    }
}
