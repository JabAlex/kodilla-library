package com.kodillalibrary.repository;

import com.kodillalibrary.domain.BookTitle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BookTitleRepository extends CrudRepository<BookTitle, Long> {
    @Override
    List<BookTitle> findAll();
}
