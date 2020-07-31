package com.company;

public interface IAlmacen {
    public void nuevoProducto(String ref,double precio,int stock);
    public void seleccionarProducto(String ref);

    public void aumentarStock(int stock);
    public void quitarStock(int stock);
    public int consultarStock();

    public double consultarPrecio();
    public void modificarPrecio(double precio);
}
