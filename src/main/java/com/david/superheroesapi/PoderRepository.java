package com.david.superheroesapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PoderRepository extends JpaRepository<Poder, Long> {
    // Aquí puedes agregar consultas personalizadas si quieres
}
