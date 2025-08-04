package com.gestion.bibliotheque.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class LoanBook extends EntityBase {

    @Column(nullable = false)
    private LocalDateTime loanDateTime;

    @Column(nullable = false)
    private LocalDateTime expectedDate;

    @Column(nullable = false)
    private long dayBorrowing;

    private boolean isReturn=false;
    private LocalDateTime returnDateTime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Book book;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private UserBibliotheque user;

}
