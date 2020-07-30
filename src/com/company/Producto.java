package com.company;

public class Producto {
    protected double unidad;
    public Producto (double inicial){
        unidad=inicial;
    }
    public void nuevoProducto (double unidades){
        unidad=unidad+unidades;

    }
}
