package com.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookCopyStatusDto {
    private long copyId;
    private BookCopyStatus bookCopyStatus;
}
