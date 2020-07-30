package com.company;

import java.util.List;

public class Almacen implements IAlmacen {
    private List<Integer> listaProductos;
    private int productoSeleccionado;

    @Override
    public void nuevoProducto(String referencia, double precio, int stock) {
    }

    @Override
    public void seleccionarProducto(String referencia) {

    }

    @Override
    public void incrementarStock(int unidades) {

    }

    @Override
    public void retirarProducto(int unidades) {

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
    public void modificarPrecio(double nuevoPrecio) {

    }
}
