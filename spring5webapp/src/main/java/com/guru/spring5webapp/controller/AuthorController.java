/*
 *  Company: RS
 *  Project: spring5webapp
 *  Created: 28 lis 2018  20:55:51
 *  Author:  RS
 */
package com.guru.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guru.spring5webapp.repositories.AuthorRepository;

/**
 *<p></p><br>28 lis 2018
 * @author RS
 *
 */
@Controller
public class AuthorController {

	
	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";	
	}
}
