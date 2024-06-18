package com.vaibhav.librarymanagementsystem.Models;


import com.sun.jdi.PrimitiveValue;
import com.vaibhav.librarymanagementsystem.Enum.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    private String bookName;

    private Integer noOfPages;

    private String authorName;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @JoinColumn
    @ManyToOne
    private Author author;
}