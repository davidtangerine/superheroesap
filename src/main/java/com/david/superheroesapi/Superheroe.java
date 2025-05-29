package com.david.superheroesapi;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Superheroe {
    @Id
    private Long id;
    private String nombre;
    private String ciudad;
    private boolean activo;

    @OneToMany(mappedBy = "superheroe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Poder> poderes = new ArrayList<>();

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public List<Poder> getPoderes() { return poderes; }
    public void setPoderes(List<Poder> poderes) { this.poderes = poderes; }
}
