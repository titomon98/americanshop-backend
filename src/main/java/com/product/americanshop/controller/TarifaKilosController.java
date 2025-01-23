package com.product.americanshop.controller;

import com.product.americanshop.model.TarifaKilos;
import com.product.americanshop.service.TarifaKilosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarifas")
public class TarifaKilosController {

    @Autowired
    private TarifaKilosService tarifaKilosService;

    @GetMapping
    public List<TarifaKilos> getAllTarifasKilos() {
        return tarifaKilosService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarifaKilos> getTarifaKilosById(@PathVariable Long id) {
        return ResponseEntity.of(tarifaKilosService.findById(id));
    }

    @PostMapping
    public TarifaKilos createTarifaKilos(@RequestBody TarifaKilos tarifaKilos) {
        return tarifaKilosService.save(tarifaKilos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TarifaKilos> updateTarifaKilos(@PathVariable Long id, @RequestBody TarifaKilos tarifaKilos) {
        return ResponseEntity.of(tarifaKilosService.update(id, tarifaKilos));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarifaKilos(@PathVariable Long id) {
        tarifaKilosService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

