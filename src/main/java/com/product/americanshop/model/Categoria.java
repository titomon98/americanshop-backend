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
    @Column(name = "iva", nullable = false)
    private Double iva;
    @Column(name = "derecho", nullable = false)
    private Double derecho;
    @Column(name = "estadistica", nullable = false)
    private Double estadistica;
    @Column(name = "interno", nullable = false)
    private Double interno;
    @Column(name = "seguro", nullable = false)
    private Double seguro;
    @Column(name = "tjt", nullable = false)
    private Double tjt;
    @Column(name = "nombre", nullable = false)
    private String nombre;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getDerecho() {
        return derecho;
    }

    public void setDerecho(Double derecho) {
        this.derecho = derecho;
    }

    public Double getEstadistica() {
        return estadistica;
    }

    public void setEstadistica(Double estadistica) {
        this.estadistica = estadistica;
    }

    public Double getInterno() {
        return interno;
    }

    public void setInterno(Double interno) {
        this.interno = interno;
    }

    public Double getSeguro() {
        return seguro;
    }

    public void setSeguro(Double seguro) {
        this.seguro = seguro;
    }

    public Double getTjt() {
        return tjt;
    }

    public void setTjt(Double tjt) {
        this.tjt = tjt;
    }
}
