package com.company;

public class Producto {
    protected String referencia;
    protected double precio;
    protected int stock;

    public Producto(String referencia, double precio, int stock) {
        this.referencia = referencia;
        this.precio = precio;
        this.stock = stock;
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

    @Override
    public String toString() {
        return "Producto{" +
                "referencia='" + referencia + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    public void añadir(int unidades) {
        this.stock += unidades;

    }

    public void restar(int unidades) {
        this.stock -= unidades;

    }
}