package com.explore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOKDETAILS")
public class Book implements Serializable{
	
	private static final long serialVersionUID =5857883241528139490L;
	@Id
	@GeneratedValue
	private int id;
	private String bookname;
	private String price;
	protected Book() {
		
	}
	public Book(int id, String bookname, String price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getBookname() {
		return bookname;
	}
	public String getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", price=" + price + "]";
	}
	
	
}
