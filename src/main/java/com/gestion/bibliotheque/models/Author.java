package com.gestion.bibliotheque.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Author extends EntityBase {

    @Column(nullable = false)
    private String name;

    private String bibliography;
    private LocalDate birthday;
}
