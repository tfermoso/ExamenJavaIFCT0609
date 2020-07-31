package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen implements IAlmacen {
    private List<Producto> productos;
    protected Producto productoSeleccionado;

    public Almacen() {
        productos = new ArrayList<>();
        productoSeleccionado = null;
    }

    @Override
    public void nuevoProducto(String referencia, double precio, int stock) {
        productos.add(new Producto(referencia, precio, stock));
    }

    @Override
    public void seleccionarProducto(String referencia) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getReferencia().equals(referencia)) {
                productoSeleccionado = productos.get(i);
                return;
            }
        }
    }
    public boolean productoSeleccionado() {
        if (productoSeleccionado == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void incrementarStock(int unidades) {
        if (productoSeleccionado != null) {
            productoSeleccionado.incrementarStock(unidades);
        }
    }

    @Override
    public void retirarProducto(int unidades) {
        if (productoSeleccionado != null) {
            productoSeleccionado.retirarProducto(unidades);
        }
    }

    @Override
    public int consultarStock() {

        if (productoSeleccionado != null) {
            return productoSeleccionado.consultarStock();
        }
        return consultarStock();
    }

    @Override
    public double consultarPrecio() {
        if (productoSeleccionado != null) {
            return productoSeleccionado.consultarPrecio();
        }
        return consultarPrecio();
    }

    @Override
    public double[][] modificarPrecio() {
        if (productoSeleccionado==productoSeleccionado){
            return new double[1][];
        }
        return new double[0][];
    }

    //public boolean resultadoUltimaOperacion() {
        //if (productoSeleccionado != null) {
            //return productoSeleccionado.resultadoUltimaOperacion();
        //}
        //return false;
    //}



}
