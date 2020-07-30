package com.company;

public class Almacen implements IAlmacen {
    private Producto[] almacen;
    private Producto productoSelec;
    private int contador;

    public Almacen() {
        this.almacen = new Producto[50];
        this.contador = 0;
    }

    //añadir productos nuevos al almacén (indicando referencia, precio y stock).
    // incrementar el stock de un producto que está en el almacén retirar una o más
    // unidades de un producto consultar stock de un producto consultar precio de un producto
    // modificar el precio de un producto
    public void añadirProducto(String ref, double precio, int stock) {
        almacen[contador] = new Producto(ref, precio, stock);
        contador++;
    }

    @Override
    public void seleccionarProducto(String ref) {
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i]!=null) {
                if (almacen[i].ref.equals(ref)) {
                    productoSelec = almacen[i];
                    return;
                }
            }
        }
    }

    public void aumentarStock(int stock) {
        productoSelec.stock += stock;
    }

    public void retirarStock(int resta) {
        productoSelec.stock -= resta;
    }

    public int consultarStock() {
        return productoSelec.stock;
    }

    public double consultarPrecio() {
        return productoSelec.precio;
    }

    public void cambiarPrecio(double precio) {
        productoSelec.precio = precio;
    }
}
