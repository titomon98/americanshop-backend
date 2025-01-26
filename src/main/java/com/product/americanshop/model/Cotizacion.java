package com.product.americanshop.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cotizaciones")
public class Cotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "monto_total", nullable = false)
    private Double montoTotal;

    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @Column(name = "estado", nullable = false)
    private Integer estado;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_tarifa_kilos")
    private TarifaKilos tarifaKilos;

    @ManyToOne
    @JoinColumn(name = "id_localidades")
    private Localidad localidad;

    @ManyToOne
    @JoinColumn(name = "id_promociones")
    private Promocion promocion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public TarifaKilos getTarifaKilos() {
        return tarifaKilos;
    }

    public void setTarifaKilos(TarifaKilos tarifaKilos) {
        this.tarifaKilos = tarifaKilos;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
