package com.product.americanshop.service;

import com.product.americanshop.model.Cotizacion;
import com.product.americanshop.repository.CotizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CotizacionService {
    @Autowired
    private CotizacionRepository cotizacionRepository;

    public List<Cotizacion> findAll() {
        return cotizacionRepository.findAll();
    }

    public Optional<Cotizacion> findById(Long id) {
        return cotizacionRepository.findById(id);
    }

    public Cotizacion save(Cotizacion cotizacion) {
        return cotizacionRepository.save(cotizacion);
    }

    public Optional<Cotizacion> update(Long id, Cotizacion cotizacion) {
        return cotizacionRepository.findById(id).map(existing -> {
            existing.setMontoTotal(cotizacion.getMontoTotal());
            existing.setUsuario(cotizacion.getUsuario());
            existing.setFecha(cotizacion.getFecha());
            existing.setCategoria(cotizacion.getCategoria());
            existing.setTarifaKilos(cotizacion.getTarifaKilos());
            existing.setLocalidad(cotizacion.getLocalidad());
            existing.setPromocion(cotizacion.getPromocion());
            existing.setEstado(cotizacion.getEstado());
            return cotizacionRepository.save(existing);
        });
    }

    public boolean deleteById(Long id) {
        if (cotizacionRepository.existsById(id)) {
            cotizacionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
