package com.company.models;

public class Producto {
    private int stock;
    private double precio;
    private String referencia;

    public Producto(int stock, double precio, String referencia) {
        this.stock = stock;
        this.precio = precio;
        this.referencia = referencia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
