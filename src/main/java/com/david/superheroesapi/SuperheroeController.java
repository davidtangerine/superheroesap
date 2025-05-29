package com.david.superheroesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/superheroes")
public class SuperheroeController {

    @Autowired
    private SuperheroeRepository superheroeRepository;

    // Devuelve todos los superhéroes
    @GetMapping
    public List<Superheroe> getAllSuperheroes() {
        return superheroeRepository.findAll();
    }

    // Crea un nuevo superhéroe
    @PostMapping
    public Superheroe createSuperheroe(@RequestBody Superheroe superheroe) {
        return superheroeRepository.save(superheroe);
    }
}
