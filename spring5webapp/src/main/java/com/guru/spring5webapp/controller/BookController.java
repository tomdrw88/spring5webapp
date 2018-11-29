/*
 *  Company: RS
 *  Project: spring5webapp
 *  Created: 25 lis 2018  22:04:35
 *  Author:  RS
 */
package com.guru.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guru.spring5webapp.repositories.BookRepository;

/**
 *<p></p><br>25 lis 2018
 * @author RS
 *
 */
@Controller
public class BookController {

	private BookRepository bookRepository;
	
	
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}



	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books";
	}
}
