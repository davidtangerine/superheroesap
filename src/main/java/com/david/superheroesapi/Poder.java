package com.david.superheroesapi;

import jakarta.persistence.*;

@Entity
public class Poder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String poder;
    private int nivel;

    @ManyToOne
    @JoinColumn(name = "superheroe_id")
    private Superheroe superheroe;

    public Long getId() { return id; }

    public String getPoder() { return poder; }
    public void setPoder(String poder) { this.poder = poder; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public Superheroe getSuperheroe() { return superheroe; }
    public void setSuperheroe(Superheroe superheroe) { this.superheroe = superheroe; }
}
