package com.example.springbootmongodbone.web;

import com.example.springbootmongodbone.document.Author;
import com.example.springbootmongodbone.document.Book;
import com.example.springbootmongodbone.document.Library;
import com.example.springbootmongodbone.repository.AuthorRepository;
import com.example.springbootmongodbone.repository.BookRepository;
import com.example.springbootmongodbone.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private LibraryRepository libraryRepository;

    @Autowired
    public WebController(AuthorRepository authorRepository, BookRepository bookRepository, LibraryRepository libraryRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.libraryRepository = libraryRepository;
    }

    @GetMapping("author")
    public Author getAuthor() {
        return new Author();
    }

    @GetMapping("book")
    public Book getBook() {
        return new Book();
    }

    @GetMapping("library")
    public Library getLibrary() {
        return new Library();
    }


    @GetMapping("author/list")
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("book/list")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("library/list")
    public List<Library> getLibraries() {
        return libraryRepository.findAll();
    }


    @PostMapping("book")
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PostMapping("library")
    public Library saveLibrary(@RequestBody Library library) {
        return libraryRepository.save(library);
    }

    @PostMapping("author")
    public Author saveAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }


    @DeleteMapping("book")
    public void deleteBook(@RequestBody Book book) {
        bookRepository.delete(book);
    }

    @DeleteMapping("library")
    public void deleteLibrary(@RequestBody Library library) {
        libraryRepository.delete(library);
    }

    @DeleteMapping("author")
    public void deleteAuthor(@RequestBody Author author) {
        authorRepository.delete(author);
    }


    @DeleteMapping("book/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }

    @DeleteMapping("library/{id}")
    public void deleteLibraryById(@PathVariable Long id) {
        libraryRepository.deleteById(id);
    }

    @DeleteMapping("author/{id}")
    public void deleteAuthorById(@PathVariable Long id) {
        authorRepository.deleteById(id);
    }

}
