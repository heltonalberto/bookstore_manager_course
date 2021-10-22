package com.heltonalberto.bookstoremanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.heltonalberto.bookstoremanager.dto.BookDTO;
import com.heltonalberto.bookstoremanager.entity.Book;

@Mapper
public interface BookMapper {

	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	Book toModel(BookDTO bookDTO);
	//Book toModel(Book book);
	
	BookDTO toDTO(Book book);
}
