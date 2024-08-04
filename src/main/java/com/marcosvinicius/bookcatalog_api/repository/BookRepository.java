package com.marcosvinicius.bookcatalog_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcosvinicius.bookcatalog_api.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
