package com.company;

public interface IAlmacen {
    void añadirProducto(String ref,double precio,int stock);
    void seleccionarProducto(String ref);
    void aumentarStock(int stock);
    void retirarStock(int stock);
    int consultarStock();
    double consultarPrecio();
    void cambiarPrecio(double precio);
    String mostrarSeleccionado();
}
