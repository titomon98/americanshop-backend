package com.product.americanshop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_cotizaciones")
public class DetalleCotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "peso", nullable = false)
    private Double peso;

    @Column(name = "flete", nullable = false)
    private Double flete;

    @Column(name = "aduana", nullable = false)
    private Double aduana;

    @Column(name = "iva", nullable = false)
    private Double iva;

    @Column(name = "seguro", nullable = false)
    private Double seguro;

    @Column(name = "subtotal", nullable = false)
    private Double subtotal;
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

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public Double getAduana() {
        return aduana;
    }

    public void setAduana(Double aduana) {
        this.aduana = aduana;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getSeguro() {
        return seguro;
    }

    public void setSeguro(Double seguro) {
        this.seguro = seguro;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
