package com.coursework.service;

import java.util.List;

import com.coursework.model.Book;
import org.springframework.data.domain.Page;

public interface BookService {
	List<Book> getAllBooks();
	void saveBook(Book book);
	Book getBookById(long id);
	void deleteBookById(long id);
	Page<Book> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
