package com.landingBackend.page.controller;

import com.landingBackend.page.entities.Producto;
import com.landingBackend.page.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    ProductoRepository productoRepository;
    @GetMapping("/productos")
    public ResponseEntity<List<Producto>> getAllProducts() {
        return ResponseEntity.ok(productoRepository.findAll());
    }


}
