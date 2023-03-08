package com.kodillalibrary.repository;

import com.kodillalibrary.domain.BookCopy;
import com.kodillalibrary.domain.BookCopyStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BookCopyRepository extends CrudRepository<BookCopy, Long> {
    BookCopy findById(long bookCopyId);
    List<BookCopy> findByBookCopyStatus(BookCopyStatus bookCopyStatus);
    List<BookCopy> findAllByTitleId(long titleId);

}
