package com.vaibhav.librarymanagementsystem.StudentRepositories;

import com.vaibhav.librarymanagementsystem.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

}