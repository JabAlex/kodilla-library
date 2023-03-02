package com.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity(name = "book_copies")
public class BookCopy {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "book_title_id")
    private long titleId;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private BookCopyStatus bookCopyStatus;

    public BookCopy(long titleId, BookCopyStatus bookCopyStatus) {
        this.titleId = titleId;
        this.bookCopyStatus = bookCopyStatus;
    }
}
