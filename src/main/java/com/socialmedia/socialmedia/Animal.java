package com.socialmedia.socialmedia;

import javax.persistence.*;

@Entity
@Table(name = "shenba_animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String animal_name;
    private String animal_type;
    public Animal(){}
    public Animal(String animal_name, String animal_type) {
        this.animal_name = animal_name;
        this.animal_type = animal_type;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }





}
