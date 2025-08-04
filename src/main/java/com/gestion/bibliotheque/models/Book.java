package com.gestion.bibliotheque.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Book extends EntityBase{

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDate publicationDate;

    @Column(nullable = false, unique = true)
    private String isbn;

    private String description;
    private String publisher;

    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryBook categoryBook;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Author author;
}
