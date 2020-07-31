package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen implements IAlmacen {

    private Producto[] almacen;
    private Producto productoSeleccionado;
    private int contador;


    public Almacen() {
        this.almacen = new Producto[100];
        this.contador = 0;


    }


    @Override
    public void nuevoProducto(String ref, double precio, int stock) {
        almacen[contador] = new Producto(ref, precio, stock);
        contador++;
    }

    @Override
    public void seleccionarProducto(String ref) {
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i] != null) {
                if (almacen[i].ref.equals(ref)) {
                    productoSeleccionado = almacen[i];
                    return;
                }

            }
        }
    }
    

    @Override
    public void aumentarStock(int stock) {
        productoSeleccionado.stock += stock;
    }
    

    @Override
    public void quitarStock(int stock) {
        productoSeleccionado.stock -= stock;
    }

    @Override
    public int consultarStock() {
        return productoSeleccionado.stock;
    }

    @Override
    public double consultarPrecio() {
        return productoSeleccionado.precio;
    }

    @Override
    public void modificarPrecio(double precio) {
        productoSeleccionado.precio=precio;
    }





}
