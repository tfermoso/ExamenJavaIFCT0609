package com.company.models;

import java.util.ArrayList;

public class Almacen implements IAlmacen {
    String productoSeleccionado = null;
    ArrayList<Producto> productos = new ArrayList<>();

    public String getProductoSeleccionado() {
        return productoSeleccionado;
    }

    @Override
    public void nuevoProducto() {

    }

    @Override
    public void seleccionarProducto() {

    }

    @Override
    public void incrementarStock() {

    }

    @Override
    public void retirarProducto() {

    }

    @Override
    public int consultarStock() {
        return 0;
    }

    @Override
    public double consultarPrecio() {
        return 0;
    }

    @Override
    public void modificarPrecio() {

    }
}
