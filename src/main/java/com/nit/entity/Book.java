package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book_table")
@Data
@NoArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "BOOK_ID")
	private Long id;
	private String name;
	private String author;
	private String category;
	private Double price;
	private Boolean available;
	public Book(String name, String author, String category, Double price, Boolean available) {
		super();
		this.name = name;
		this.author = author;
		this.category = category;
		this.price = price;
		this.available = available;
	}
	
	

}
