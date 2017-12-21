package com.test.demo.repositories;

import com.test.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lakmal on 12/21/17.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
