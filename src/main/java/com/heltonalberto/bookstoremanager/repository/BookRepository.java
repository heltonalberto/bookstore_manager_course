package com.heltonalberto.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.heltonalberto.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
