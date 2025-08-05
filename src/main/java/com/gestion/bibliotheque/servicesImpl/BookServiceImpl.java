package com.gestion.bibliotheque.servicesImpl;

import com.gestion.bibliotheque.dtos.BookDto;
import com.gestion.bibliotheque.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public ResponseEntity<?> createBook(BookDto book) {
        return null;
    }
}
