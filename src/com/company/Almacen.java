package com.company;

public class Almacen implements IAlmacen {
    private Producto[] almacen;
    private Producto productoSeleccionado;
    private int contador;


    public Almacen() {
        this.almacen = almacen;
        this.productoSeleccionado = productoSeleccionado;
        this.contador = contador;
    }

    @Override
    public void nuevoProducto(String referencia, double precio, int stock) {
        almacen[contador] = new Producto(referencia, precio, stock);
        contador++;
    }

    @Override
    public void seleccionarProducto(String referencia) {
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i]!=null) {
                if (almacen[i].referencia.equals(referencia)) {
                    productoSeleccionado = almacen[i];
                    return;
                }
            }
        }
    }

    @Override
    public double incrementarStock(int stock) {
        this.productoSeleccionado.stock+=stock;
        return 0;
    }


    @Override
    public void retirarProducto(int stock) {
            this.productoSeleccionado.stock-= stock;
    }

    @Override
    public int consultarStock() {
            return productoSeleccionado.stock ;
    }

    @Override
    public double consultarPrecio() {
            return productoSeleccionado.precio;
    }

    @Override
    public void modificarPrecio(double nuevoPrecio) {
            productoSeleccionado.precio = nuevoPrecio;
    }

    @Override
    public String mostrarProductoSeleccionado() {
        if (productoSeleccionado!=null){
            return productoSeleccionado.referencia+" "+productoSeleccionado.precio+" "+productoSeleccionado.stock;
        }else {
            return "No hay producto seleccionado";
        }
    }
}



























