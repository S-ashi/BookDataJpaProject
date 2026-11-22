package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
    
	List<Book>findByName(String name);
	List<Book>findByAuthor(String Author);
	
	List<Book>findByCategory(String Category);
	
	List<Book>findByPrice(Double price);
	
	List<Book>findByAvailable(Boolean avialbale);
	
	List<Book>findByAuthorAndCategory(String author,String category);
	
	List<Book>findByCategoryAndAvailable(String category,Boolean available);
	
	List<Book>findByPriceGreaterThan(Double price);
	
	List<Book>findByPriceLessThan(Double price);
	
	List<Book>findByPriceBetween(Double price1,Double price2);
	
	List<Book>findByNameStartingWith(String name);
	
	List<Book>findByNameContaining(String name);
	
	List<Book>findByAuthorOrderByPriceAsc(String author);
	
	List<Book>findAllByOrderByPriceDesc();
	
}
