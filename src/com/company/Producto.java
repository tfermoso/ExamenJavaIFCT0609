package com.company;

public class Producto {

    private String referencia;
    private double precio;
    private int stock;

    public Producto(String referencia, double precio, int strock) {
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

    public int getStrock() {
        return stock;
    }

    public void setStrock(int strock) {
        this.stock = strock;
    }
}
