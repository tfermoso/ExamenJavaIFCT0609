package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        // write your code here
        Scanner leer = new Scanner(System.in);
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
                    System.out.println("Escribe la Referencia del producto");
                    String referencia = leer.nextLine();
                    System.out.println("Escribe las precio del producto");
                    double precio = leer.nextDouble();
                    leer.nextLine();
                    System.out.println("Introduce las unidades ");
                    int stock = leer.nextInt();
                    leer.nextLine();
                    almacen.nuevoProducto(referencia, precio, stock);

                    break;

                case 2:
                    System.out.println("Referencia producto");
                    referencia = leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println("Unidades a añadir:");
                    int unidades = leer.nextInt();
                    leer.nextLine();
                    almacen.incrementarStock(unidades);
                    break;

                case 3:
                    System.out.println("Referencia producto");
                    referencia = leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println("Unidades a retirar: ");
                    unidades = leer.nextInt();
                    leer.nextLine();
                    almacen.retirarProducto(unidades);
                    break;

                case 4:
                    System.out.println("Referencia producto");
                    referencia = leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println("El precio del producto seleccionado es: " + almacen.consultarPrecio());


                    break;

                case 5:
                    System.out.println("Referencia producto");
                    referencia = leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println("Las unidadesd de stock son : " + almacen.consultarStock());

                    break;

                case 6:
                    System.out.println("Referencia producto");
                    referencia = leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println("Introduce el nuevo precio: ");
                    precio = leer.nextDouble();
                    leer.nextLine();
                    almacen.modificarPrecio(precio);
                    break;
                case 7:
                    System.out.println("Referencia producto");
                    referencia = leer.nextLine();
                    almacen.seleccionarProducto(referencia);
                    System.out.println(almacen.mostrarProducto());
                    break;

                case 8:
                    break;
            }

        } while (opcion!= 8);
    }
}
