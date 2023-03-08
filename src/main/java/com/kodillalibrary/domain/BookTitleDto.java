package com.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookTitleDto {
    private long id;
    private String title;
    private String author;
    private int publicationYear;
}
