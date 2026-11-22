package com.nit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nit.entity.Book;
import com.nit.repository.BookRepository;

@Service
public class BookService {
	
	private final BookRepository repo;

	public BookService(BookRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public void insertBook() {
		Book book=new Book( "Java Programming",
                "James Gosling",
                "Programming",
                650.0,
                true);
		
		repo.save(book);
		System.out.println("Book inserted successfully");
	}
	
	public void insertMultipleBook() {
		List<Book> book=Arrays.asList( new Book("Spring Boot", "Craig Walls", "Programming", 750.0, true),
	            new Book("Effective Java", "Joshua Bloch", "Programming", 850.0, true),
	            new Book("Clean Code", "Robert Martin", "Programming", 900.0, false),
	            new Book("Wings of Fire", "A.P.J. Abdul Kalam", "Biography", 350.0, true),
	            new Book("Atomic Habits", "James Clear", "Self Help", 450.0, true),
	            new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 500.0, false),
	            new Book("Python Basics", "John Smith", "Programming", 550.0, true),
	            new Book("The Alchemist", "Paulo Coelho", "Fiction", 400.0, true),
	            new Book("Think and Grow Rich", "Napoleon Hill", "Self Help", 600.0, false)
	        );
		repo.saveAll(book);
		System.out.println("All book inserted successfully");
	}
	
	public void findBookById(Long id) {
		Optional<Book>optional=repo.findById(id);
		
		if(optional.isPresent()) {
			System.out.println("Book found");
		}else {
			System.out.println("Book not found");
		}
	}
	
	public void displayAllBooks() {
		List<Book> books=repo.findAll();
		
		for(Book book:books) {
			System.out.println(book);
		}
	}
	
	public void updateBook(Long id,Double newPrice) {
		Optional<Book>optional=repo.findById(id);
		
		if(optional.isPresent()) {
			Book book=optional.get();
			book.setPrice(newPrice);
			repo.save(book);
			System.out.println("Book updated successfully");
		}
		else {
			System.out.println("Book not found");
		}
	}
	
	public void deleteBook(Long id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			System.out.println("Deleted successfully");
		}else {
			System.out.println("Book not Found");
		}
	}
	
	public void deleteAllBooks() {
		repo.deleteAll();
		System.out.println("All book deleted");
	}
	
	public void checkBookExist(Long id) {
		Boolean result=repo.existsById(id);
		System.out.println("Book Exists: "+result);
	}
	public void countTotalBooks() {
		Long count=repo.count();
		
		System.out.println("Total Counts: "+count);
	}
	
	
	public void findByName(String name) {
		System.out.println(repo.findByName(name));
	}
	
	public void findByAuthor(String author) {
		System.out.println(repo.findByAuthor(author));
	}
	
	public void findByCategory(String category) {
		System.out.println(repo.findByCategory(category));
	}
	public void findByPrice(Double price) {
		System.out.println(repo.findByPrice(price));
	}
	public void findByAvailable(Boolean available) {
		System.out.println(repo.findByAvailable(available));
	}
	public void findByAuthorAndCategory(String author,String category) {
		System.out.println(repo.findByAuthorAndCategory(author, category));
	}
	public void findByCategoryAndAvailable(String category,Boolean available) {
		repo.findByCategoryAndAvailable(category, available).forEach(System.out::println);
	}
	
	public void findByPriceGreaterThan(Double price) {
		repo.findByPriceGreaterThan(price).forEach(System.out::println);
	}
	public void findByPriceLessThan(Double price) {
		repo.findByPriceLessThan(price).forEach(System.out::println);
	}
	public void findByPriceBetween(Double price1,double price2) {
		repo.findByPriceBetween(price1, price2).forEach(System.out::println);
	}
	public void findByNameStartingWith(String name) {
		repo.findByNameStartingWith(name).forEach(System.out::println);
	}
	
	public void findByNameContaining(String name) {
		repo.findByNameContaining(name).forEach(System.out::println);
	}
	
	public void findByAuthorOrderByPriceAsc(String author) {
		repo.findByAuthorOrderByPriceAsc(author).forEach(System.out::println);
	}
	public void findAllByOrderByPriceDesc() {
		repo.findAllByOrderByPriceDesc().forEach(System.out::println);
	}

}
