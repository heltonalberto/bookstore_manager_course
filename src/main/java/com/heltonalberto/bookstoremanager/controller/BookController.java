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
import com.heltonalberto.bookstoremanager.entity.Book;
import com.heltonalberto.bookstoremanager.exception.BookNotFoundException;
import com.heltonalberto.bookstoremanager.repository.BookRepository;
import com.heltonalberto.bookstoremanager.service.BookService;

//@RestController mostra ao spring que esta classe é um controller de uma api Rest onde o bean é gerenciado pelo proprio spring
@RestController
//@RequestMapping indica o endpoint onde será realizado o acesso ao controller
@RequestMapping("/api/v1/books")
public class BookController {

	private BookService bookService;

	//@AutoWired faz a injeção de dependencia de um atributo da classe bookRepository para uso dentro dessa classe
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}


	//@PostMapping marca esta operção pelo tipo Post do modelo Rest, que siginifica que este método junto com o corpo passado pelo livro 
	@PostMapping
	public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
		return bookService.create(bookDTO);
	}
	
	//@PostMapping
	//public MessageResponseDTO create(@RequestBody Book book) {
	//	return bookService.create(book);
	//}

	
	//@PostMapping
	//public MessageResponseDTO create(@RequestBody Book book) {
	//	Book savedBook = bookRepository.save(book);
	//	return MessageResponseDTO.builder()
	//			.message("Livro created with ID: " + savedBook.getId())
	//			.build();
	//}


	//@GetMapping("/{id}")
	//public BookDTO findById(@PathVariable Long id) throws BookNotFoundException {
	//	return bookService.findById(id);
	//}
}
