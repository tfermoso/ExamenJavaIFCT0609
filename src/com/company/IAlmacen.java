package com.company;

public interface IAlmacen {
    public void nuevoProducto(String referencia,double precio, int stock);

    public void seleccionarProducto(String referencia);

    public void incrementarStock(int unidades);

    public void retirarProducto(int unidades);

    public int consultarStock();

    public double consultarPrecio();

    public void modificarPrecio(double nuevoPrecio);

}
