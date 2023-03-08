package com.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
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

    public void setBookCopyStatus(BookCopyStatus bookCopyStatus){
        this.bookCopyStatus = bookCopyStatus;
    }
}
