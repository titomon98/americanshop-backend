package com.product.americanshop.controller;

import com.product.americanshop.model.DetalleCotizacion;
import com.product.americanshop.service.DetalleCotizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles-cotizacion")
public class DetalleCotizacionController {

    @Autowired
    private DetalleCotizacionService detalleCotizacionService;

    @GetMapping
    public List<DetalleCotizacion> getAllDetallesCotizacion() {
        return detalleCotizacionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleCotizacion> getDetalleCotizacionById(@PathVariable Long id) {
        return ResponseEntity.of(detalleCotizacionService.findById(id));
    }

    @PostMapping
    public DetalleCotizacion createDetalleCotizacion(@RequestBody DetalleCotizacion detalleCotizacion) {
        return detalleCotizacionService.save(detalleCotizacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleCotizacion> updateDetalleCotizacion(@PathVariable Long id, @RequestBody DetalleCotizacion detalleCotizacion) {
        return ResponseEntity.of(detalleCotizacionService.update(id, detalleCotizacion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetalleCotizacion(@PathVariable Long id) {
        detalleCotizacionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
