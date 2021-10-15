package com.heltonalberto.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heltonalberto.bookstoremanager.dto.MessageResponseDTO;
import com.heltonalberto.bookstoremanager.entity.Book;
import com.heltonalberto.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

	private BookRepository bookrepository;

	@Autowired
	public BookService(BookRepository bookrepository) {
		super();
		this.bookrepository = bookrepository;
	}

	
	public MessageResponseDTO create(Book book) {
		Book savedBook= bookrepository.save(book);
		return MessageResponseDTO.builder()
				.message("Book created with ID " + savedBook.getId())
				.build();
	}

	
}
