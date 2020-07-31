package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leer=new Scanner(System.in);
        Almacen almacen=new Almacen();
        String referencia;
        double precio;
        int stock;

        String menu="Gestión Inventario\n" +
                "1. Añadir nuevo producto al almacén\n" +
                "2. Incrementar stock\n" +
                "3. Retirar unidades\n" +
                "4. Consular precio\n" +
                "5. Consultar stock\n" +
                "6. Modificar precio\n" +
                "7. Mostrar Producto\n" +
                "8. Salir";
        int opcion;
        do{
            System.out.println(menu);
            opcion=leer.nextInt();
            leer.nextLine();
            //TODO
            switch (opcion){
                case 1:
                    System.out.println("Introduzca referencia");
                    referencia=leer.nextLine();
                    System.out.println("Introduzca precio");
                    precio=leer.nextDouble();
                    System.out.println("Introduzca stock");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.nuevoProducto(referencia,precio,stock);
                    break;
                case 2:
                    System.out.println("Introduzca la referencia del producto: ");
                    referencia=leer.nextLine();
                    System.out.println("Introduzca cantidad: ");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    almacen.incrementarStock(stock);
                    break;
                case 3:
                    System.out.println("Introduzca la referencia del producto");
                    referencia=leer.nextLine();
                    System.out.println("Introduzca cantidad a retirar: ");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    almacen.retirarProducto(stock);
                    break;
                case 4:
                    System.out.println("Introduzca la referencia del producto");
                    referencia=leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println(almacen.consultarPrecio());
                    break;
                case 5:
                    System.out.println("Introduzca la referencia del producto: ");
                    referencia=leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println(almacen.consultarStock());
                    break;
                case 6:
                    System.out.println("Introduzca la referencia del producto: ");
                    referencia=leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println("Introduzca el nuevo precio: ");
                    precio=leer.nextDouble();
                    almacen.modificarPrecio(precio);
                    break;
                case 7:
                    System.out.println(almacen.mostrarProductoSeleccionado());
                    break;
            }

        }while(opcion!=7);
    }
}

