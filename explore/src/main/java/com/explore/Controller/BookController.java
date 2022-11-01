package com.explore.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.explore.Service.BookService;
import com.explore.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/save")
	public int saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
		return book.getId();
	}
	
	@GetMapping("/allbooks")
	public List<Book> getAllBooksdetails(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/getBookById/{id}")
	public Optional<Book> getBookById(@PathVariable int id) {
		return bookService.getBookById(id);
	}
	
	@DeleteMapping("/deleteBookById/{id}")
	public List<Book> deleteBookById(@PathVariable int id){
		bookService.deleteBookById(id);
		return bookService.getAllBooks();
	}
}
