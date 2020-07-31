package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        Scanner leer = new Scanner(System.in);
String referencia;
int stock;
double precio;
        String menu = "Gestión Inventario\n" +
                "1. Añadir nuevo producto al almacén\n" +
                "2. Incrementar stock\n" +
                "3. Retirar unidades\n" +
                "4. Consular precio\n" +
                "5. Consultar stock\n" +
                "6. Modificar precio\n" +
                "7. Mostrar producto\n" +
                "8. Salir";
        int opcion;

        do {
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    addProducto(almacen, leer);
                    break;
                case 2:
                    sumProducto(almacen, leer);
                    break;
                case 3:
                    restProducto(almacen, leer);
                    break;
                case 4:
                    System.out.println("Introduce la referencia:");
                    referencia = leer.nextLine();
                    almacen.selectProducto(referencia);
                    System.out.println(almacen.consultarPrecio());
                    break;
                case 5:
                    System.out.println("Introduce la referencia:");
                    referencia = leer.nextLine();
                    almacen.selectProducto(referencia);
                    System.out.println(almacen.consultarStock());
                    break;
                case 6:
                    cambiarPrecio(almacen, leer);
                    break;
                case 7:
                    System.out.println("Introduce la referencia:");
                     referencia = leer.nextLine();
                    almacen.selectProducto(referencia);
                    System.out.println(almacen.mostrarProducto(referencia));
                    break;
                case 8:

                    break;


            }

        } while (opcion != 8);
    }



    private static void cambiarPrecio(Almacen almacen, Scanner leer) {
        System.out.println("Introduce la referencia:");
        String referencia = leer.nextLine();
        System.out.println("Introduce el nuevo precio: ");
        double precio = leer.nextDouble();

        almacen.selectProducto(referencia);
        almacen.modificarPrecio(referencia, precio);

    }

    private static void sumProducto(Almacen almacen, Scanner leer) {
        System.out.println("Introduce la referencia:");
        String referencia = leer.nextLine();
        System.out.println(" Introduzca las unidades a añadir: ");
        int unidades = leer.nextInt();
        System.out.println("Introduce la referencia:");
        almacen.selectProducto(referencia);
        almacen.incrementarProducto(unidades);
        leer.nextLine();

        System.out.println("Stock actualizado correctamente");


    }

    private static void restProducto(Almacen almacen, Scanner leer) {
        System.out.println("Introduce la referencia:");
        String referencia = leer.nextLine();
        System.out.println(" Introduzca las unidades a reducir: ");
        int unidades = leer.nextInt();
        almacen.selectProducto(referencia);
        almacen.retirarProducto(unidades);
        leer.nextLine();
        System.out.println("Stock actualizado correctamente");

    }

    private static void addProducto(Almacen almacen, Scanner leer) {
        System.out.println("Introduce la referencia del producto: ");
        String referencia = leer.nextLine();
        System.out.println("Introduce el precio del producto: ");
        double precio = leer.nextDouble();
        System.out.println("Introduce el stock del producto: ");
        int stock = leer.nextInt();
        almacen.añadirProducto(referencia, precio, stock);

    }
}
