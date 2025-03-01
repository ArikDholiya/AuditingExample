package com.AuditExample.auditing.Conroller;

import com.AuditExample.auditing.Book;
import com.AuditExample.auditing.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//@EnableJpaRepositories(repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/getAllBook")
    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }
    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);

    }

    @PutMapping("/updateBook/{id}/{pages}")
    public String updateBook(@PathVariable Long id, @PathVariable Long pages){

        Book book= bookRepository.findById(id).get();
        book.setPages(pages);
        bookRepository.save(book);
        return "Book pages has been updated";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
        return "Book Deleted";
    }

}
