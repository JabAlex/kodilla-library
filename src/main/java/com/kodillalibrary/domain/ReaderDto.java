package com.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class ReaderDto {
    private long id;
    private String firstname;
    private String lastname;
    private LocalDate accountCreationDate;
}
