package com.test.demo.repositories;

import com.test.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lakmal on 12/21/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
