package com.company;

public interface IAlmacen {


    public void nuevoProducto(String referencia, double precio, int stock);
    public void seleccionarProducto(String referencia);
    public double incrementarStock(int stock);
    public void retirarProducto(int stock);
    public int consultarStock();
    public double consultarPrecio();
    public void modificarPrecio(double nuevoPrecio);
    String mostrarProductoSeleccionado();

}
