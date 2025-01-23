package com.product.americanshop.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "localidades")
public class Localidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    //El valor de incluida debe ser 1 si se incluye o 0 si no se incluye.
    @Column(name = "incluida", nullable = false)
    private Integer incluida;
    @Column(name = "estado", nullable = false)
    private Integer estado;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIncluida() {
        return incluida;
    }

    public void setIncluida(Integer incluida) {
        this.incluida = incluida;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
