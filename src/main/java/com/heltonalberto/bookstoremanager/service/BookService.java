package com.heltonalberto.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heltonalberto.bookstoremanager.dto.BookDTO;
import com.heltonalberto.bookstoremanager.dto.MessageResponseDTO;
import com.heltonalberto.bookstoremanager.entity.Book;
import com.heltonalberto.bookstoremanager.mapper.BookMapper;
import com.heltonalberto.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

	private BookRepository bookrepository;
	
	private final BookMapper bookMapper = BookMapper.INSTANCE;

	@Autowired
	public BookService(BookRepository bookrepository) {
		super();
		this.bookrepository = bookrepository;
	}

	
	public MessageResponseDTO create(BookDTO bookDTO) {
		Book bookToSave = bookMapper.toModel(bookDTO);
		
		Book savedBook= bookrepository.save(bookToSave);
		return MessageResponseDTO.builder()
				.message("Book created with ID " + savedBook.getId())
				.build();
	}

	
}
