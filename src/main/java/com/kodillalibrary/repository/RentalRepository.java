package com.kodillalibrary.repository;

import com.kodillalibrary.domain.Rental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface RentalRepository extends CrudRepository<Rental, Long> {
}
