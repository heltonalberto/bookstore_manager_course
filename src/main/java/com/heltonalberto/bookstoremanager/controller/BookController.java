package com.heltonalberto.bookstoremanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heltonalberto.bookstoremanager.dto.BookDTO;
import com.heltonalberto.bookstoremanager.dto.MessageResponseDTO;
import com.heltonalberto.bookstoremanager.exception.BookNotFoundException;
import com.heltonalberto.bookstoremanager.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
	
	private BookService bookService;
	//private BookRepository bookRepository;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	//@PostMapping
	//public MessageResponseDTO create(Book book) {
	//	return bookService.create(book);
	//}
	
	//@Autowired
	//public BookController(BookRepository bookRepository) {
	//	this.bookRepository = bookRepository;
	//}
	
	//@PostMapping
	//public MessageResponseDTO create(@RequestBody Book book) {
	//	Book savedBook = bookRepository.save(book);
	//	return MessageResponseDTO.builder()
	//			.message("Livro created with ID: " + savedBook.getId())
	//			.build();
	//}

	@PostMapping
	public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
		return bookService.create(bookDTO);
	}
	
	@GetMapping("/{id}")
	public BookDTO findById(@PathVariable Long id) throws BookNotFoundException{
		return bookService.findById(id);
	}
}
