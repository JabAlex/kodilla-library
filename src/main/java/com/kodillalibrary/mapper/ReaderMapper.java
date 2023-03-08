package com.kodillalibrary.mapper;

import com.kodillalibrary.domain.Reader;
import com.kodillalibrary.domain.ReaderDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderMapper {

    public Reader mapToReader(ReaderDto readerDto){
        return new Reader(
                readerDto.getId(),
                readerDto.getFirstname(),
                readerDto.getLastname()
        );
    }
    public ReaderDto mapToReaderDto(Reader reader){
        return new ReaderDto(
                reader.getId(),
                reader.getFirstname(),
                reader.getLastname(),
                reader.getAccountCreationDate()
        );
    }
    public List<ReaderDto> mapToReaderDtoList(List<Reader> readerList){
        return readerList.stream()
                .map(this::mapToReaderDto)
                .toList();
    }
}
