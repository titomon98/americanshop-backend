package com.product.americanshop.controller;

import com.product.americanshop.model.Localidad;
import com.product.americanshop.service.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/localidades")
public class LocalidadController {

    @Autowired
    private LocalidadService localidadService;

    @GetMapping
    public List<Localidad> getAllLocalidades() {
        return localidadService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Localidad> getLocalidadById(@PathVariable Long id) {
        return ResponseEntity.of(localidadService.findById(id));
    }

    @PostMapping
    public Localidad createLocalidad(@RequestBody Localidad localidad) {
        return localidadService.save(localidad);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Localidad> updateLocalidad(@PathVariable Long id, @RequestBody Localidad localidad) {
        return ResponseEntity.of(localidadService.update(id, localidad));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLocalidad(@PathVariable Long id) {
        localidadService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

