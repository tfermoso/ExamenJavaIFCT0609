package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen implements IAlmacen {
    private List<Producto> productoList;
    private  Producto productoSeleccionado;

    public Almacen() {
        productoList=new ArrayList<>();
        productoSeleccionado=null;
    }

    @Override
    public void nuevoProducto(String referencia, double precio, int stock) {
        productoList.add(new Producto(referencia,stock,precio));
    }

    @Override
    public void seleccionarProducto(String referencia) {
        for (int i = 0; i < productoList.size(); i++) {
            if(productoList.get(i).getReferencia().equals(referencia)){
                productoSeleccionado=productoList.get(i);
                return;
            }
        }
    }

    @Override
    public void incrementarStock(int unidades) {
        productoSeleccionado.incrementarStock(unidades);
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

    @Override
    public String mostrarProducto() {
        return productoSeleccionado.toString();
    }
}
