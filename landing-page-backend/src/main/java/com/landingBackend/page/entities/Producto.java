package com.landingBackend.page.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // crea los getters y setters
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Producto {
    @Id
    private long id;
    private float precio;
    private String nombre;
    private String talla;
}
