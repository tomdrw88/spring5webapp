/*
 *  Company: RS
 *  Project: spring5webapp
 *  Created: 21 lis 2018  22:23:34
 *  Author:  RS
 */
package com.guru.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.guru.spring5webapp.model.Author;

/**
 *<p></p><br>21 lis 2018
 * @author RS
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{

}
