package com.explore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.explore.model.Book;
import com.explore.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public String saveBook(Book book) {
		
		bookRepository.save(book);
		
		return "New Book has been saved in DB with id: "+book.getId();
	}
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	
	public Optional<Book> getBookById(int bookId) {
		return bookRepository.findById(bookId);
	}
	
	public void  deleteBookById(int bookId){
		 bookRepository.deleteById(bookId);
	}
}
