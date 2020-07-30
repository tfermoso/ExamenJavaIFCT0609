package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen implements IAlmacen {
    private List<Producto> listadeProductos;
    private Producto productoSelect ;

    public Almacen() {
       listadeProductos=new ArrayList();
        productoSelect=null;
    }



    @Override
    public void añadirProducto(String referencia, double precio, int stock) {

       listadeProductos.add(new Producto (referencia,precio,stock));

    }

    @Override
    public void selectProducto(String referencia) {
        for (int i = 0; i < listadeProductos.size(); i++) {
            if (listadeProductos.get(i).getReferencia().equals(referencia)) {
                productoSelect = listadeProductos.get(i);
                return;
            }

        }}

    @Override
    public void incrementarProducto(int unidades) {


            if(productoSelect!=null){
               productoSelect.añadir(unidades);

            }

            }



    @Override
    public void retirarProducto(int unidades) {
        if(productoSelect!=null){
            productoSelect.restar(unidades);

        }

    }

    @Override
    public int consultarStock() {
        if (productoSelect != null) {
            return productoSelect.getStock();
        }
        return 0;

    }

    @Override
    public double consultarPrecio() {
        if (productoSelect != null) {
            return productoSelect.getPrecio();
        }
        return 0;
    }

    @Override
    public void modificarPrecio() {



    }
}
