package com.vaibhav.librarymanagementsystem.StudentRepositories;

import com.vaibhav.librarymanagementsystem.Models.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {
}