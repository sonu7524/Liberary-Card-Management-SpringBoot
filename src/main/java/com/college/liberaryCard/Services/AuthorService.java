package com.college.liberaryCard.Services;

import com.college.liberaryCard.Models.Author;
import com.college.liberaryCard.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Author added Successfully";
    }
}
