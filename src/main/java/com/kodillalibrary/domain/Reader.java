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
@Entity(name = "readers")
public class Reader {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "account_creation_date")
    private LocalDate accountCreationDate;

    public Reader(String firstname, String lastname, LocalDate accountCreationDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountCreationDate = accountCreationDate;
    }
}
