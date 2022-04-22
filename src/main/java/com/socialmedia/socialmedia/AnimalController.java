package com.socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {
    @Autowired
    AnimalService animalService;
    @PutMapping("/animal")
    public void addanimals(@RequestBody Animal animal){
        animalService.addanimals(animal);

    }
    @GetMapping("/animal")
    public List<Animal> getanimal(){
        return animalService.getanimal();
    }
    @GetMapping("/animal/{animal_id}")
    public Optional<Animal> getbyid(@PathVariable ("animal_id") Integer animal_id){

    }
}
