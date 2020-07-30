package com.company;

public class Producto {

    private String referencia;
    private double precio;
    private int stock;
    private int unidades;

    public Producto(String referencia, double precio, int stock) {
        this.referencia = referencia;
        this.precio = precio;
        this.stock = stock;
        this.unidades=unidades;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
