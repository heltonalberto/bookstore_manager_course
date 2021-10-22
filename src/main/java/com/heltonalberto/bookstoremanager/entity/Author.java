package com.heltonalberto.bookstoremanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity define que esta classe terá relação com o banco de dados
@Entity
//@Data inclui os metodos getters and setters e hashcodes
@Data
//@Builder utilizado para configurar objetos de forma segura
@Builder
//@NoArgsConstructor gera construtores sem argumentos
@NoArgsConstructor
//@AllArgsConstructor gera construtores com argumentos
@AllArgsConstructor
public class Author {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false)
	private Integer age;

}