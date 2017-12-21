package com.test.demo.repositories;

import com.test.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lakmal on 12/21/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
