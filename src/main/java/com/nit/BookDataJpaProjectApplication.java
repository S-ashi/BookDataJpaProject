package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.BookService;

@SpringBootApplication
public class BookDataJpaProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(BookDataJpaProjectApplication.class, args);
		
		BookService service=context.getBean(BookService.class);
		System.out.println("Insert one book");
		service.insertBook();
		
		System.out.println("Insert multiple books");
		service.insertMultipleBook();
		
		service.displayAllBooks();

        service.findBookById(1L);

        service.updateBook(1L, 1000.0);

        service.checkBookExist(1L);
        service.countTotalBooks();

        // Finder operations
        service.findByName("Java Programming");
        service.findByAuthor("James Gosling");
        service.findByCategory("Programming");
        service.findByPrice(650.0);
        service.findByAvailable(true);

        service.findByAuthorAndCategory("James Gosling", "Programming");
        service.findByCategoryAndAvailable("Programming", true);

        service.findByPriceGreaterThan(500.0);
        service.findByPriceLessThan(500.0);
        service.findByPriceBetween(300.0, 700.0);

        service.findByNameStartingWith("S");
        service.findByNameContaining("Java");

        service.findByAuthorOrderByPriceAsc("James Gosling");
        service.findAllByOrderByPriceDesc();

        // Delete operation — uncomment when you want to test
        // service.deleteBook(1L);

        // Delete all — uncomment only when required
        // service.deleteAllBooks();

        context.close();
	}

}
