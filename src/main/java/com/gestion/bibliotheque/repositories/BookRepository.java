package com.gestion.bibliotheque.repositories;

import com.gestion.bibliotheque.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}