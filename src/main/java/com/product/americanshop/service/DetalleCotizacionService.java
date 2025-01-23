package com.product.americanshop.service;

import com.product.americanshop.model.DetalleCotizacion;
import com.product.americanshop.repository.DetalleCotizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DetalleCotizacionService {
    @Autowired
    private DetalleCotizacionRepository detalleCotizacionRepository;

    public List<DetalleCotizacion> findAll() {
        return detalleCotizacionRepository.findAll();
    }

    public Optional<DetalleCotizacion> findById(Long id) {
        return detalleCotizacionRepository.findById(id);
    }

    public DetalleCotizacion save(DetalleCotizacion detalleCotizacion) {
        return detalleCotizacionRepository.save(detalleCotizacion);
    }

    public Optional<DetalleCotizacion> update(Long id, DetalleCotizacion detalleCotizacion) {
        return detalleCotizacionRepository.findById(id).map(existing -> {
            existing.setPeso(detalleCotizacion.getPeso());
            existing.setFlete(detalleCotizacion.getFlete());
            existing.setAduana(detalleCotizacion.getAduana());
            existing.setIva(detalleCotizacion.getIva());
            existing.setSeguro(detalleCotizacion.getSeguro());
            existing.setSubtotal(detalleCotizacion.getSubtotal());
            existing.setEstado(detalleCotizacion.getEstado());
            return detalleCotizacionRepository.save(existing);
        });
    }

    public boolean deleteById(Long id) {
        if (detalleCotizacionRepository.existsById(id)) {
            detalleCotizacionRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
