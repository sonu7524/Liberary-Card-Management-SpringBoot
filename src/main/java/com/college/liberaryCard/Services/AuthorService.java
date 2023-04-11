package com.college.liberaryCard.Services;

import com.college.liberaryCard.Models.Author;
import com.college.liberaryCard.Models.Book;
import com.college.liberaryCard.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Author added Successfully";
    }

    public List<String> findBooksByAuthor(String authorName){
        Author author = authorRepository.findAuthorByName(authorName);
        List<Book> bookList = author.getBookList();
        List<String> books = new ArrayList<>();
        for(int i=0; i<bookList.size(); i++){
            books.add(bookList.get(i).getName());
        }
        return books;
    }
}
