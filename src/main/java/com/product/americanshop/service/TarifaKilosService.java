package com.product.americanshop.service;

import com.product.americanshop.model.TarifaKilos;
import com.product.americanshop.repository.TarifaKilosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarifaKilosService {
    @Autowired
    private TarifaKilosRepository tarifaKilosRepository;

    public List<TarifaKilos> findAll() {
        return tarifaKilosRepository.findAll();
    }

    public Optional<TarifaKilos> findById(Long id) {
        return tarifaKilosRepository.findById(id);
    }

    public TarifaKilos save(TarifaKilos tarifaKilos) {
        return tarifaKilosRepository.save(tarifaKilos);
    }

    public Optional<TarifaKilos> update(Long id, TarifaKilos tarifaKilos) {
        return tarifaKilosRepository.findById(id).map(existing -> {
            existing.setPeso(tarifaKilos.getPeso());
            existing.setTarifaAmba(tarifaKilos.getTarifaAmba());
            existing.setTarifaBsas(tarifaKilos.getTarifaBsas());
            existing.setTarifaResto(tarifaKilos.getTarifaResto());
            existing.setEstado(tarifaKilos.getEstado());
            return tarifaKilosRepository.save(existing);
        });
    }

    public boolean deleteById(Long id) {
        if (tarifaKilosRepository.existsById(id)) {
            tarifaKilosRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
