package com.college.liberaryCard.Repository;

import com.college.liberaryCard.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findAuthorByName(String autherName);
}
