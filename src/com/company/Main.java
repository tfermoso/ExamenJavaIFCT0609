package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
Almacen almacen=new Almacen();
        String referencia;
        double precio;
        int stock;
        Scanner leer = new Scanner(System.in);
        String menu = "Gestión Inventario\n" +
                "1. Añadir nuevo producto al almacén\n" +
                "2. Incrementar stock\n" +
                "3. Retirar unidades\n" +
                "4. Consular precio\n" +
                "5. Consultar stock\n" +
                "6. Modificar precio\n" +
                "7. Salir";
        int opcion;
        do {
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
addProducto(almacen,leer);
                    break;
                case 2:
                    sumProducto(almacen,leer);
                    break;
                case 3:
                    restProducto(almacen,leer);
                    break;


            }

        } while (opcion != 7);
    }

    private static void sumProducto(Almacen almacen, Scanner leer) {
        System.out.println(" Introduzca las unidades a añadir: ");
       int unidades = leer.nextInt();
        almacen.incrementarProducto(unidades);
        leer.nextLine();


    }

    private static void restProducto(Almacen almacen, Scanner leer) {

    }

    private static void addProducto(Almacen almacen, Scanner leer) {
        System.out.println("Introduce la referencia del producto: ");
        String referencia = leer.nextLine();
        System.out.println("Introduce el precio del producto: ");
        double precio=leer.nextDouble();
        System.out.println("Introduce el stock del producto: ");
        int stock= leer.nextInt();
        almacen.añadirProducto(referencia,precio,stock);
    }
}
