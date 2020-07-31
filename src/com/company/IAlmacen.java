package com.company;

public interface IAlmacen {
public void añadirProducto(String referencia, double precio, int stock);
public void selectProducto(String referencia);
public  void incrementarProducto(int unidades);
public void retirarProducto(int unidades);
public int consultarStock();
public double consultarPrecio();
public void modificarPrecio(String referencia,double nuevoPrecio);
public String mostrarProducto(String referencia);

}
