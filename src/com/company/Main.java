package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leer=new Scanner(System.in);
        ProductosSeleccionados productos= new ProductosSeleccionados();
        String menu="Gestión Inventario\n" +
                "1. Añadir nuevo producto al almacén\n" +
                "2. Incrementar stock\n" +
                "3. Retirar unidades\n" +
                "4. Consular precio\n" +
                "5. Consultar stock\n" +
                "6. Modificar precio\n" +
                "7. Salir";
        int opcion;
        do {
            if (productos.productoSeleccionado()) {
                System.out.println(menu);
                opcion = leer.nextInt();
                leer.nextLine();
                int unidades;
                //TODO
                switch (opcion) {
                    case 1:
                        System.out.println("Añadir producto al Almacen");
                        unidades = leer.nextInt();
                        leer.nextLine();
                        producto

                        break;

                    case 2:
                        System.out.println("Incremento de Stock al Almacen");

                        break;

                    case 3:
                        System.out.println("Retirar unidades de producto");
                        break;

                    case 4:
                        System.out.println("Consultar Precio");
                        break;
                    case 5:
                        System.out.println("Consultar Stock");
                        break;

                    case 6:
                        System.out.println("Modificar Precio");
                        break;

                    case 7:
                        System.out.println("Salir");
                        break;
                }
            } while (opcion != 7) ;
        }
}}
