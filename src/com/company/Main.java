package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leer=new Scanner(System.in);
        Almacen almacen=new Almacen();
        String ref;
        double precio;
        int stock;
        String menu="Gestión Inventario\n" +
                "1. Añadir nuevo producto al almacén\n" +
                "2. Incrementar stock\n" +
                "3. Retirar unidades\n" +
                "4. Consular precio\n" +
                "5. Consultar stock\n" +
                "6. Modificar precio\n" +
                "7. Salir";
        int opcion;
        do{
            System.out.println(menu);
            opcion=leer.nextInt();
            leer.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduzca referencia");
                   ref=leer.nextLine();
                    System.out.println("Introduzca precio");
                    precio=leer.nextDouble();
                    System.out.println("Introduzca stock");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.añadirProducto(ref,precio,stock);
                    break;
                case 2:
                    System.out.println("Introduzca referencia del producto");
                    ref=leer.nextLine();
                    System.out.println("Introduzca cuanto stock hay a añadir");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.seleccionarProducto(ref);
                    almacen.aumentarStock(stock);
                    break;
                case 3:
                    System.out.println("Introduzca referencia del producto");
                    ref=leer.nextLine();
                    System.out.println("Introduzca cuanto stock hay a retirar");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.seleccionarProducto(ref);
                    almacen.retirarStock(stock);
                    break;
                case 4:
                    System.out.println("Introduzca referencia del producto");
                    ref=leer.nextLine();
                    almacen.seleccionarProducto(ref);
                    System.out.println(almacen.consultarPrecio());
                    break;
                case 5:
                    System.out.println("Introduzca referencia del producto");
                    ref=leer.nextLine();
                    almacen.seleccionarProducto(ref);
                    System.out.println(almacen.consultarStock());
                    break;
                case 6:
                    System.out.println("Introduzca referencia del producto");
                    ref=leer.nextLine();
                    almacen.seleccionarProducto(ref);
                    System.out.println("Introduzca nuevo precio");
                    precio=leer.nextDouble();
                    almacen.cambiarPrecio(precio);
                    break;
                case 7:
                    break;
            }

        }while(opcion!=7);
    }
}
