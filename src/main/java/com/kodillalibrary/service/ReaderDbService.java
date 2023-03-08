package com.kodillalibrary.service;

import com.kodillalibrary.domain.Reader;
import com.kodillalibrary.repository.ReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReaderDbService {
    private final ReaderRepository repository;

    public List<Reader> getAllReaders(){
        return repository.findAll();
    }
    public Reader addReader(final Reader reader){
        return repository.save(reader);
    }
}
