package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "museos")
public class Museo {
    private int id_serial;
    private String nombre;
    private String pais;
    private String ciudad;
    private String direccion;


    public Museo() {

    }

    public Museo(int id_serial, String nombre, String pais, String ciudad,String direccion) {
        this.id_serial = id_serial;
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
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

    public String getCiudad() {return ciudad;}

    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}
}
