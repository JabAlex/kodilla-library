package com.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@Entity(name = "rentals")
public class Rental {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "book_copy_id")
    private long bookCopyId;
    @Column(name = "reader_id")
    private long readerId;
    @Column(name = "rental_start_date")
    private LocalDate rentalStartDate;
    @Column(name = "return_date")
    private LocalDate returnDate;

    public Rental(long id, long bookCopyId, long readerId) {
        this.id = id;
        this.bookCopyId = bookCopyId;
        this.readerId = readerId;
        this.rentalStartDate = LocalDate.now();
    }
    public void returnBook(){
        this.returnDate = LocalDate.now();
    }
}
