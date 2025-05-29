package com.david.superheroesapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperheroeRepository extends JpaRepository<Superheroe, Long> {
    // Aquí puedes agregar consultas personalizadas si quieres
}
