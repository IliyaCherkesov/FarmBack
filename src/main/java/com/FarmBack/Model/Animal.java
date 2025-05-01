package com.FarmBack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    public String id;

    public String getId() {return id;}

    public String species;

    public String getSpecies() { return species; }

    public String birthdate;

    public String getBirthdate() {
        return birthdate;
    }

    public String sex;

    public String getSex() {
        return sex;
    }

    public String animal_event;

    public String getAnimal_event() {
        return animal_event;
    }

    public String animal_state;

    public String getAnimal_state() {
        return animal_state;
    }
}