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

    public String getReferencia() {
        //this.referencia=referencia;
        return referencia;
    }

    public int consultarStock() {
        this.stock=stock;
        return 0;
    }

    public double consultarPrecio() {
        this.precio=precio;
        return 1;
    }

    public boolean resultadoUltimaOperacion() {
        return true;


    }
}
