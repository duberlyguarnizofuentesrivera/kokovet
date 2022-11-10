package com.michaelmascco.kokovet.model;

import java.io.InputStream;

public class Producto {
    int id;
    String nombres;
    InputStream foto;
    String detalle;
    double precio;
    int stock;

    public Producto(int id, String nombres, InputStream foto, String detalle, double precio, int stock) {
        this.id = id;
        this.nombres = nombres;
        this.foto = foto;
        this.detalle = detalle;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
