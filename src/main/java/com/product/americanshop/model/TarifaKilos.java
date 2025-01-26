package com.product.americanshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tarifa_kilos")
public class TarifaKilos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "peso", nullable = false)
    private Double peso;
    @Column(name = "tarifa_amba", nullable = false)
    private Double tarifaAmba;
    @Column(name = "tarifa_bsas", nullable = false)
    private Double tarifaBsas;
    @Column(name = "tarifa_resto", nullable = false)
    private Double tarifaResto;
    @Column(name = "estado", nullable = false)
    private Integer estado;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTarifaAmba() {
        return tarifaAmba;
    }

    public void setTarifaAmba(Double tarifaAmba) {
        this.tarifaAmba = tarifaAmba;
    }

    public Double getTarifaBsas() {
        return tarifaBsas;
    }

    public void setTarifaBsas(Double tarifaBsas) {
        this.tarifaBsas = tarifaBsas;
    }

    public Double getTarifaResto() {
        return tarifaResto;
    }

    public void setTarifaResto(Double tarifaResto) {
        this.tarifaResto = tarifaResto;
    }
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
