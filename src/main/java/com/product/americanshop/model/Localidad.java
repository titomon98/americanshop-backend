package com.product.americanshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "localidades")
public class Localidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    //El valor de tarifa debe ser 1 para AMBA, 2 para BSAS, 3 para Resto del pais y 0 si no está incluída.
    @Column(name = "tarifa", nullable = false)
    private Integer tarifa;
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

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
