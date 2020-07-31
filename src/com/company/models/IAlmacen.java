package com.company.models;

public interface IAlmacen {
    void nuevoProducto(String a, double b, int c);
    void seleccionarProducto(String a);
    void incrementarStock(int a);
    void retirarProducto(int a);
    int consultarStock();
    double consultarPrecio();
    void modificarPrecio(double a);
}
