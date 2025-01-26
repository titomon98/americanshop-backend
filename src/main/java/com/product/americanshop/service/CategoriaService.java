package com.product.americanshop.service;

import com.product.americanshop.model.Categoria;
import com.product.americanshop.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll().stream()
        .filter(categoria -> categoria.getEstado() == 1)
        .toList();
    }

    public Optional<Categoria> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Optional<Categoria> update(Long id, Categoria categoria) {
        return categoriaRepository.findById(id).map(existing -> {
            existing.setPorcentajeFob(categoria.getPorcentajeFob());
            existing.setNombre(categoria.getNombre());
            existing.setEstado(categoria.getEstado());
            existing.setIva(categoria.getIva());
            existing.setDerecho(categoria.getDerecho());
            existing.setEstadistica(categoria.getEstadistica());
            existing.setInterno(categoria.getInterno());
            existing.setSeguro(categoria.getSeguro());
            existing.setTjt(categoria.getTjt());
            return categoriaRepository.save(existing);
        });
    }

    public boolean deleteById(Long id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
