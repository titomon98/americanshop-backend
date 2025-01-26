package com.product.americanshop.service;

import com.product.americanshop.model.Localidad;
import com.product.americanshop.repository.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;

    public List<Localidad> findAll() {
        return localidadRepository.findAll();
    }

    public Optional<Localidad> findById(Long id) {
        return localidadRepository.findById(id);
    }

    public Localidad save(Localidad localidad) {
        return localidadRepository.save(localidad);
    }

    public Optional<Localidad> update(Long id, Localidad localidad) {
        return localidadRepository.findById(id).map(existing -> {
            existing.setNombre(localidad.getNombre());
            existing.setTarifa(localidad.getTarifa());
            existing.setEstado(localidad.getEstado());
            return localidadRepository.save(existing);
        });
    }

    public boolean deleteById(Long id) {
        if (localidadRepository.existsById(id)) {
            localidadRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
