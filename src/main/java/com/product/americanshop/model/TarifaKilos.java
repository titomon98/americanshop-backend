package com.product.americanshop.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tarifa_kilos")
public class TarifaKilos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "peso", nullable = false)
    private String peso;
    @Column(name = "tarifa_amba", nullable = false)
    private String tarifaAmba;
    @Column(name = "tarifa_bsas", nullable = false)
    private String tarifaBsas;
    @Column(name = "tarifa_resto", nullable = false)
    private String tarifaResto;
    @Column(name = "estado", nullable = false)
    private Integer estado;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTarifaAmba() {
        return tarifaAmba;
    }

    public void setTarifaAmba(String tarifaAmba) {
        this.tarifaAmba = tarifaAmba;
    }

    public String getTarifaBsas() {
        return tarifaBsas;
    }

    public void setTarifaBsas(String tarifaBsas) {
        this.tarifaBsas = tarifaBsas;
    }

    public String getTarifaResto() {
        return tarifaResto;
    }

    public void setTarifaResto(String tarifaResto) {
        this.tarifaResto = tarifaResto;
    }
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
