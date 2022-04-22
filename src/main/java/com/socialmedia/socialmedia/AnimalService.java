package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    public  void addanimals(Animal animal){
        animalRepository.save(animal);
    }
    public List<Animal> getanimal(){
        return animalRepository.findAll();
    }
}
