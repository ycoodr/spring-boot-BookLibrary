package com.app.springBook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.springBook.entity.Book;
import com.app.springBook.service.BookService;
import com.app.springBook.entity.*;

@SpringBootApplication
public class SpringBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookservice){
		return (args) -> {
			// Book book1 = new Book("ABC1", "Book name", "My first book");
			// Author author1 = new Author("Test name1", "Test description");
			// Category category1 = new Category("Science books");
			// Publisher publisher1 = new Publisher("First publisher");
			// book1.addAuthor(author1);
			// book1.addCategory(category1);
			// book1.addPublisher(publisher1);
			// bookservice.createBook(book1);

			Book book2 = new Book("ABC2", "Book name", "My first book");
			Author author2 = new Author("Test name2", "Test description");
			Category category2 = new Category("Sex books");
			Publisher publisher2 = new Publisher("Second publisher");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookservice.createBook(book2);

			Book book3 = new Book("ABC3", "Book name", "My first book");
			Author author3 = new Author("Test name3", "Test description");
			Category category3 = new Category("Horror books");
			Publisher publisher3 = new Publisher("Third publisher");
			book3.addAuthor(author3);
			book3.addCategory(category3);
			book3.addPublisher(publisher3);
			bookservice.createBook(book3);
		};
	}

}
