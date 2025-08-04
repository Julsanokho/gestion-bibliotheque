package com.gestion.bibliotheque.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class CategoryBook extends EntityBase {
    private String name;
}
