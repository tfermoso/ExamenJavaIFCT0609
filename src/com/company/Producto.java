package com.company;

public class Producto {
    protected String referencia;
    protected double precio;
    protected int stock;
    private String referencia1;
    private double precio1;
    private int stock1;


    public Producto(String referencia, double precio, int stock){
        this.referencia = referencia;
        this.precio = precio;
        this.stock = stock;
    }

    public void nuevoProducto(String referencia, double precio, int stock) {
       this.referencia1=referencia;
       this.precio1=precio;
       this.stock1=stock;

    }

    public void seleccionarProducto(String referencia1) {
        this.referencia1=referencia;
    }

    public boolean productoSeleccionado() {
        return true;
    }

    public void incrementarStock(int istock){
        this.stock+=istock;
    }
    public void retirarProducto(int rstock){
        this.stock-=rstock;
    }

    public String getReferencia() {
        return referencia;
    }

    public int consultarStock() {
        this.stock=stock;
        return 0;
    }

    public double consultarPrecio() {
        return precio;
    }

    public void modificarPrecio(double precio) {
        return;
    }



    //public boolean resultadoUltimaOperacion() {
        //return true;
    //}

}
