package com.heltonalberto.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heltonalberto.bookstoremanager.dto.AuthorDTO;
import com.heltonalberto.bookstoremanager.dto.BookDTO;
import com.heltonalberto.bookstoremanager.dto.MessageResponseDTO;
import com.heltonalberto.bookstoremanager.entity.Author;
import com.heltonalberto.bookstoremanager.entity.Book;
import com.heltonalberto.bookstoremanager.exception.BookNotFoundException;
import com.heltonalberto.bookstoremanager.mapper.BookMapper;
import com.heltonalberto.bookstoremanager.repository.BookRepository;

//@Service anotação do spring para dizer ao framework que esta classe será gerenciada pelo spring e podera receber a injeção de outros serviços
@Service
public class BookService {

	private BookRepository bookRepository;
	
	private final BookMapper bookMapper = BookMapper.INSTANCE;

	@Autowired
	public BookService(BookRepository bookrepository) {
		this.bookRepository = bookrepository;
	}

	public MessageResponseDTO create(BookDTO bookDTO) {
		Book bookToSave = bookMapper.toModel(bookDTO);
		
		Book savedBook= bookRepository.save(bookToSave);
		return MessageResponseDTO.builder()
				.message("Book created with ID " + savedBook.getId())
				.build();
	}
		
	public BookDTO findById(Long id) throws BookNotFoundException {
		Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
		
		return bookMapper.toDTO(book);
	}
	
	//public MessageResponseDTO create(Book book) {
		//	Book savedBook= bookRepository.save(book);
		//	return MessageResponseDTO.builder()
		//			.message("Book created with ID " + savedBook.getId())
		//			.build();
		//}

}
