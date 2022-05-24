package com.coursework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "publisher")
	private String publisher;


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String firstName) {
		this.title = firstName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String lastName) {
		this.author = lastName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String email) {
		this.publisher = email;
	}
}
