package com.test.demo.bootstrap;

import com.test.demo.model.Author;
import com.test.demo.model.Book;
import com.test.demo.model.Publisher;
import com.test.demo.repositories.AuthorRepository;
import com.test.demo.repositories.BookRepository;
import com.test.demo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by lakmal on 12/21/17.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Publisher publisher = new Publisher();
        publisher.setName("pub");
        publisherRepository.save(publisher);

        Author lakmal = new Author("Lakmal", "Dasanayake");
        Book book = new Book("Domain driven design", "1234", publisher);
        lakmal.getBooks().add(book);
        book.getAuthors().add(lakmal);

        authorRepository.save(lakmal);
        bookRepository.save(book);

        Author kamal = new Author("Kamal", "Dasanayake");
        Book node = new Book("Node js", "12345", publisher);
        kamal.getBooks().add(node);

        authorRepository.save(kamal);
        bookRepository.save(node);
    }
}
