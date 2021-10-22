package com.heltonalberto.bookstoremanager.service;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
//import org.mockito.Mocks;

import com.heltonalberto.bookstoremanager.utils.BookUtils;
import com.heltonalberto.bookstoremanager.dto.BookDTO;
import com.heltonalberto.bookstoremanager.entity.Book;
import com.heltonalberto.bookstoremanager.exception.BookNotFoundException;
import com.heltonalberto.bookstoremanager.repository.BookRepository;

//@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
/*	
	@Mock
	private BookRepository bookRepository;
	
	@InjectMocks
	private BookService bookService;
	
	@Test
	void whenGivenExistingIdThenReturnThisBook() {
		Book expectedFoundBook = BookUtils.createFakeBook();
		
		Mockito.when(bookRepository.findById(expectedFoundBook.getId())).thenReturn(Optional.of(expectedFoundBook));
		
		BookDTO bookDTO = bookService.findById(expectedFoundBook.getId());
		
		Assertions.assertEquals(expectedFoundBook.getName(), bookDTO.getName());
		Assertions.assertEquals(expectedFoundBook.getIsbn(), bookDTO.getIsbn());
		Assertions.assertEquals(expectedFoundBook.getPublisherName(), bookDTO.getPublisherName());

	}
	
	@Test
	void whenGivenUnexistingIdThenNotFindThrowAnException() {
		var invalidId = 10L;
		
		when(bookRepository.findById(invalidId)).thenReturn(Optional.ofNullable(any(Book.class)));
		
		assertThrows(BookNotFoundException.class, () -> bookService.findById(invalidId));
	}
	*/	
}
