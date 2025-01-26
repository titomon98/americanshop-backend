package com.product.americanshop.service;

import com.product.americanshop.model.Promocion;
import com.product.americanshop.repository.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PromocionService {
    @Autowired
    private PromocionRepository promocionRepository;

    public List<Promocion> findAll() {
        return promocionRepository.findAll().stream()
        .filter(categoria -> categoria.getEstado() == 1)
        .toList();
    }

    public Optional<Promocion> findById(Long id) {
        return promocionRepository.findById(id);
    }

    public Promocion save(Promocion promocion) {
        return promocionRepository.save(promocion);
    }

    public Optional<Promocion> update(Long id, Promocion promocion) {
        return promocionRepository.findById(id).map(existing -> {
            existing.setCodigo(promocion.getCodigo());
            existing.setPorcentaje(promocion.getPorcentaje());
            existing.setCantidadTotal(promocion.getCantidadTotal());
            existing.setFechaInicio(promocion.getFechaInicio());
            existing.setFechaFin(promocion.getFechaFin());
            existing.setEstado(promocion.getEstado());
            return promocionRepository.save(existing);
        });
    }

    public boolean deleteById(Long id) {
        if (promocionRepository.existsById(id)) {
            promocionRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Promocion validarPromocion(String codigo) throws Exception {
        Promocion promocion = promocionRepository.findByCodigo(codigo);
        if (promocion == null) {
            throw new Exception("Código no encontrado");
        }
        if (LocalDate.now().isAfter(promocion.getFechaFin())) {
            throw new Exception("El código ha expirado");
        }
        return promocion;
    }
}
