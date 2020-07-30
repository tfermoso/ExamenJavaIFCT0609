package com.company;

public class Producto {
    //referencia (String), un precio (double) y un stock (int).
    protected String ref;
    protected double precio;
    protected int stock;


    public Producto(String ref, double precio, int stock) {
        this.ref = ref;
        this.precio = precio;
        this.stock = stock;
    }
}
