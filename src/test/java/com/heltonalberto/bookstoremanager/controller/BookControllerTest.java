package com.heltonalberto.bookstoremanager.controller;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.heltonalberto.bookstoremanager.dto.BookDTO;
import com.heltonalberto.bookstoremanager.dto.MessageResponseDTO;
import com.heltonalberto.bookstoremanager.service.BookService;
import com.heltonalberto.bookstoremanager.utils.BookUtils;

//@ExtendWith(MockitoExtension.class)
public class BookControllerTest {
/*	
	private MockMvc mockMvc;
	
	@Mock
	private BookService bookService;
	
	@InjectMocks
	private BookController bookController;
	
	@BeforeEach
	void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(bookController)
				.setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
				.setViewResolvers((viewName, locale) -> new MappingJackson2JsonView())
				.build();
	}
	
	@Test
	void testWhenPostIsCalledThenABookShouldBeCreated() throws Exception {
		BookDTO bookDTO =  BookUtils.createFakeBookDTO();
		bookDTO.setIsbn("Invalid isbn");
		
		mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/books")
				.contentType(MediaType.APPLICATION_JSON)
				.content(BookUtils.asJsonString(bookDTO)))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}
	*/
}
