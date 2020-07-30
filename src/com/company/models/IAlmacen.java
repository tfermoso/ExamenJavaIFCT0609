package com.company.models;

public interface IAlmacen {
    void nuevoProducto();
    void seleccionarProducto();
    void incrementarStock();
    void retirarProducto();
    int consultarStock();
    double consultarPrecio();
    void modificarPrecio();
}
