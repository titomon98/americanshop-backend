package com.product.americanshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "estado", nullable = false)
    private Integer estado;
    @Column(name = "porcentaje_fob", nullable = false)
    private Double porcentajeFob;
    @Column(name = "nombre", nullable = false)
    private Double nombre;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPorcentajeFob() {
        return porcentajeFob;
    }

    public void setPorcentajeFob(Double porcentajeFob) {
        this.porcentajeFob = porcentajeFob;
    }

    public Double getNombre() {
        return nombre;
    }

    public void setNombre(Double nombre) {
        this.nombre = nombre;
    }
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
