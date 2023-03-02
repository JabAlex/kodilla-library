package com.kodillalibrary.repository;

import com.kodillalibrary.domain.BookCopy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface BookCopyRepository extends CrudRepository<BookCopy, Long> {
}
