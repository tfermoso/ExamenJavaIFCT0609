package com.company;

public class Producto {
    protected String referencia;
    protected double precio;
    protected int stock;

    public Producto(String referencia,double precio, int stock){
        this.referencia = referencia;
        this.precio = precio;
        this.stock = stock;
    }
    public void incrementarStock(int istock){
        this.stock+=istock;
    }
    public void retirarProducto(int rstock){
        this.stock-=rstock;
    }

}
