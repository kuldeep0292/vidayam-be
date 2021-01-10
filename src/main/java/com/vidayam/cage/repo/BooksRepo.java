package com.vidayam.cage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidayam.cage.entities.Books;

public interface BooksRepo extends JpaRepository<Books, Integer> {

}
