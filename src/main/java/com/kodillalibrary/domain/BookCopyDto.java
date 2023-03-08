package com.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookCopyDto {
    private long id;
    private long titleId;
    private BookCopyStatus bookCopyStatus;
}
