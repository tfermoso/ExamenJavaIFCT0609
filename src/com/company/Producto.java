package com.company;

public class Producto {
    private  String referencia;
    private  int stock;
    private double precio;

    public Producto(String referencia, int stock, double precio) {
        this.referencia = referencia;
        this.stock = stock;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getStock() {
        return stock;
    }
    public void incrementarStock(int unidades){
        this.stock+=unidades;
    }
    public void retirarProducto(int unidades){
        this.stock-=unidades;
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

    @Override
    public String toString() {
        return "Producto{" +
                "referencia='" + referencia + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }
}
