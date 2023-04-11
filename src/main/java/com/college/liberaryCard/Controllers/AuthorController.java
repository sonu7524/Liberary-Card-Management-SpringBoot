package com.college.liberaryCard.Controllers;


import com.college.liberaryCard.Models.Author;
import com.college.liberaryCard.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @PostMapping("add")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("find-author")
    public List<String> findBooksByAuthor(@RequestParam("author") String authorName){
        return authorService.findBooksByAuthor(authorName);
    }
}
