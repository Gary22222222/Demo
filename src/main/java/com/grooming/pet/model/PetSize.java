package com.grooming.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class PetSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String petSize;

    public PetSize() {
    }

    public PetSize(int id, String petSize) {
        this.id = id;
        this.petSize = petSize;
    }
}
