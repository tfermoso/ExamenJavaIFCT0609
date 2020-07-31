package com.company;

public class Almacen {

    private Producto[] almacen;
    private Producto productoSeleccionado;
    private int contador;

    public Almacen() {
        this.almacen = new Producto[100];
        this.contador = 0;
    }

    public void añadirProducto(String ref, double precio, int stock) {
        almacen[contador] = new Producto(ref, precio, stock);
        contador++;
    }

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

    public void aumentarStock(int stock) {
        productoSeleccionado.stock += stock;
    }

    public void quitarStock(int restar) {
        productoSeleccionado.stock -= restar;
    }

}
