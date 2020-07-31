package com.company;

public class Producto {
    protected double precio;
    protected String ref;
    protected int stock;

    public Producto(String ref, double precio, int stock) {
        this.ref = ref;
        this.precio = precio;
        this.stock = stock;
    }


}
