package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen implements IAlmacen {

    private List<Producto> listaProductos;
    private Producto productoSeleccionado;

    public Almacen() {
        listaProductos = new ArrayList<>();
        productoSeleccionado = null;

    }


    @Override
    public void nuevoProducto(String referencia, double precio, int stock) {

        listaProductos.add(new Producto(referencia, precio, stock));
    }

    @Override
    public void seleccionarProducto(String referencia) {
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getReferencia().equals(referencia)) {
                productoSeleccionado = listaProductos.get(i);
            }


        }
    }

    @Override
    public void incrementarStock(int unidades) {
        productoSeleccionado.incrementearUnidades(unidades);

    }

    @Override
    public void retirarProducto(int unidades) {
        productoSeleccionado.retirarProducto(unidades);


    }

    @Override
    public int consultarStock() {
        return productoSeleccionado.getStock();

    }

    @Override
    public double consultarPrecio() {

        return productoSeleccionado.getPrecio();
    }


    @Override
    public void modificarPrecio(double nuevoPrecio) {
        productoSeleccionado.setPrecio(nuevoPrecio);


    }

    public String mostrarProducto() {
        return productoSeleccionado.toString();
    }
}


