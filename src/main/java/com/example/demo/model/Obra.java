package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "obras")
public class Obra {
    private int id_serial;
    private String nombre;
    private String pais;

    private int id_artista;

    public Obra() {

    }

    public Obra(int id_serial, String nombre, String pais, int id_artista) {
        this.id_serial = id_serial;
        this.nombre = nombre;
        this.pais = pais;
        this.id_artista = id_artista;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getId_serial() {
        return id_serial;
    }

    public void setId_serial(int id_serial) {
        this.id_serial = id_serial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId_artista() {return id_artista;}

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }
}
