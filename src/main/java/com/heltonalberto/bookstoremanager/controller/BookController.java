package com.heltonalberto.bookstoremanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heltonalberto.bookstoremanager.entity.Book;
import com.heltonalberto.bookstoremanager.repository.BookRepository;
import com.heltonalberto.bookstoremanager.dto.MessageResponseDTO;
import com.heltonalberto.bookstoremanager.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	
	//private BookService bookService;
	private BookRepository bookRepository;
	
	//@Autowired
	//public BookController(BookService bookService) {
	//	this.bookService = bookService;
	//}

	//@PostMapping
	//public MessageResponseDTO create(Book book) {
		//return bookService.create(book);
	//}
	
	@Autowired
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@PostMapping
	public MessageResponseDTO create(@RequestBody Book book) {
		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.builder()
				.message("Message created with ID: " + savedBook.getId())
				.build();
	}

	
}
