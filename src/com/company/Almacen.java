package com.company;

import java.util.List;

public class Almacen  implements IAlmacen {

    private List<Producto> listaProductos;
    private Producto productoSeleccionado;




    @Override
    public void nuevoProducto(String referencia, double precio, int stock) {
        Producto producto = new Producto(referencia, precio, stock);

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
