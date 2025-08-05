package com.gestion.bibliotheque.services;

import com.gestion.bibliotheque.dtos.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    ResponseEntity<?> createBook(BookDto book);
}
