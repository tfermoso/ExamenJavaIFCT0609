package com.company.models;

import java.util.ArrayList;

public class Almacen implements IAlmacen {
    String productoSeleccionado = null;
    ArrayList<Producto> productos = new ArrayList<>();

    public Producto getProductoSeleccionado() {
        Producto p = null;
        for (Producto r : productos) {
            if (r.getReferencia().equals(productoSeleccionado)) p = r;
        }
        return p;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    @Override
    public void nuevoProducto(String r, double p, int s) {
        productos.add(new Producto(s, p, r));
    }

    @Override
    public void seleccionarProducto(String r) {
        this.productoSeleccionado = r;
    }

    @Override
    public void incrementarStock(int s) {
        Producto p = getProductoSeleccionado();
        p.setStock(p.getStock() + s);
    }

    @Override
    public void retirarProducto(int s) {
        Producto p = getProductoSeleccionado();
        p.setStock(p.getStock() - s);
    }

    @Override
    public int consultarStock() {
        return getProductoSeleccionado().getStock();
    }

    @Override
    public double consultarPrecio() {
        return getProductoSeleccionado().getPrecio();
    }

    @Override
    public void modificarPrecio(double p) {
        Producto r = getProductoSeleccionado();
        r.setPrecio(p);
    }
}
