package com.college.liberaryCard.Models;

import com.college.liberaryCard.Enums.Genre;
import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int pages;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    //setting here our foriegn key
    @ManyToOne
    @JoinColumn // add extra attribute of authorId (which is foriegn key)
    private Author author;

    @ManyToOne
    @JoinColumn
    private Card card;

    public Book() {
    }

    public Book(int id, String name, int pages, Genre genre, Author author) {
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.genre = genre;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
