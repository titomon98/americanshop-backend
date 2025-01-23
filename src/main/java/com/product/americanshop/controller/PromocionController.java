package com.product.americanshop.controller;

import com.product.americanshop.model.Promocion;
import com.product.americanshop.service.PromocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/promociones")
public class PromocionController {

    @Autowired
    private PromocionService promocionService;

    @GetMapping
    public List<Promocion> getAllPromociones() {
        return promocionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Promocion> getPromocionById(@PathVariable Long id) {
        return promocionService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Promocion createPromocion(@RequestBody Promocion promocion) {
        return promocionService.save(promocion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Promocion> updatePromocion(@PathVariable Long id, @RequestBody Promocion promocion) {
        return promocionService.update(id, promocion)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePromocion(@PathVariable Long id) {
        if (promocionService.deleteById(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
