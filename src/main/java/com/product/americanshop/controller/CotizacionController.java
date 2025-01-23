package com.product.americanshop.controller;

import com.product.americanshop.model.Cotizacion;
import com.product.americanshop.service.CotizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cotizaciones")
public class CotizacionController {

    @Autowired
    private CotizacionService cotizacionService;

    @GetMapping
    public List<Cotizacion> getAllCotizaciones() {
        return cotizacionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cotizacion> getCotizacionById(@PathVariable Long id) {
        return ResponseEntity.of(cotizacionService.findById(id));
    }

    @PostMapping
    public Cotizacion createCotizacion(@RequestBody Cotizacion cotizacion) {
        return cotizacionService.save(cotizacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cotizacion> updateCotizacion(@PathVariable Long id, @RequestBody Cotizacion cotizacion) {
        return ResponseEntity.of(cotizacionService.update(id, cotizacion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCotizacion(@PathVariable Long id) {
        cotizacionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
