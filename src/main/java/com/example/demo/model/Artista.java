package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "artistas")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_serial;
    private String tipoId;
    private String tipo_ide;
    private String numero_ide;
    private String nombre;
    private String nombres;
    private String apellidos;

    public Artista() {

    }

    public Artista(Integer id_serial, String tipo_ide, String numero_ide, String nombres, String apellidos) {
        this.id_serial = id_serial;
        this.tipo_ide = tipo_ide;
        this.numero_ide = numero_ide;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }





    public void setId_serial(int id_serial) {
        this.id_serial = id_serial;
    }

    public String getTipo_ide() {
        return tipo_ide;
    }

    public void setTipo_ide(String tipo_ide) {
        this.tipo_ide = tipo_ide;
    }

    public String getNumero_ide() {
        return numero_ide;
    }

    public void setNumero_ide(String numero_ide) {
        this.numero_ide = numero_ide;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Autordb [id_serial=" + id_serial + ", tipo_ide=" + tipo_ide + ", numero_ide=" + numero_ide
                + ", nombres=" + nombres + ", apellidos=" + apellidos + "]";
    }

}
