package com.heltonalberto.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heltonalberto.bookstoremanager.dto.BookDTO;
import com.heltonalberto.bookstoremanager.dto.MessageResponseDTO;
import com.heltonalberto.bookstoremanager.entity.Book;
import com.heltonalberto.bookstoremanager.exception.BookNotFoundException;
import com.heltonalberto.bookstoremanager.mapper.BookMapper;
import com.heltonalberto.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;
	
	private final BookMapper bookMapper = BookMapper.INSTANCE;

	@Autowired
	public BookService(BookRepository bookrepository) {
		this.bookRepository = bookrepository;
	}

	public MessageResponseDTO create(BookDTO bookDTO) {
	//public MessageResponseDTO create(Book book) {
		Book bookToSave = bookMapper.toModel(bookDTO);
		//Book bookToSave = bookMapper.toModel(book);
		
		Book savedBook= bookRepository.save(bookToSave);
		return MessageResponseDTO.builder()
				.message("Book created with ID " + savedBook.getId())
				.build();
	}


	public BookDTO findById(Long id) throws BookNotFoundException {
		Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
		
		return bookMapper.toDTO(book);
	}
	
}
