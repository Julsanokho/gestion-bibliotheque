package com.gestion.bibliotheque.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.gestion.bibliotheque.models.Book}
 */
@Value
public class BookDto implements Serializable {
    String title;
    LocalDate publicationDate;
    String isbn;
    String description;
    String publisher;
    Long categoryBookId;
}