/*
 *  Company: RS
 *  Project: spring5webapp
 *  Created: 21 lis 2018  22:29:22
 *  Author:  RS
 */
package com.guru.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.guru.spring5webapp.model.Book;

/**
 *<p></p><br>21 lis 2018
 * @author RS
 *
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}
