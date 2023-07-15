package com.landingBackend.page;

import lombok.Data;

@Data // crea los getters y setters
public class Producto {
    private long id;
    private float precio;
    private String nombre;
    private String talla;


}
