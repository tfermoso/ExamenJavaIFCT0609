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
        do {
            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();

                //TODO
                switch (opcion) {
                    case 1:
                        System.out.println("¿Nº.REF Producto?");
                        ref = leer.nextLine();
                        System.out.println("¿Precio Producto?");
                        precio=leer.nextDouble();
                        System.out.println("¿Unidades para Stock del producto?");
                        stock=leer.nextInt();
                        leer.nextLine();
                        almacen.nuevoProducto(ref, precio, stock);

                        break;

                    case 2:
                        System.out.println("¿Nº.REF. Producto?");
                        ref=leer.nextLine();
                        System.out.println("¿Cuantas Unids. de Stock hay que Añadir?");
                        stock=leer.nextInt();
                        leer.nextLine();
                        almacen.seleccionarProducto(ref);
                        almacen.aumentarStock(stock);
                        break;

                    case 3:
                        System.out.println("¿Nº. REF. Producto?");
                        ref=leer.nextLine();
                        System.out.println("¿Cuantas Unids. del stock hay que Quitar");
                        stock=leer.nextInt();
                        leer.nextLine();
                        almacen.seleccionarProducto(ref);
                        almacen.quitarStock(stock);
                        break;

                    case 4:
                        System.out.println("¿Nº. REF. Producto?");
                        ref=leer.nextLine();
                        almacen.seleccionarProducto(ref);
                        System.out.println(almacen.consultarPrecio());
                        break;
                    case 5:
                        System.out.println("¿Nº. REF. Producto?");
                        ref=leer.nextLine();
                        almacen.seleccionarProducto(ref);
                        System.out.println(almacen.consultarStock());
                        break;

                    case 6:
                        System.out.println("¿Nº. REF. Producto?");
                        ref=leer.nextLine();
                        almacen.seleccionarProducto(ref);
                        System.out.println("¿Cual es el nuevo Precio/Unid.?");
                        precio=leer.nextDouble();
                        almacen.modificarPrecio(precio);
                        break;

                    case 7:
                        System.out.println("----- PROGRAMA FINALIZADO -----");
                        break;
                }
            } while (opcion != 7) ;
        }
}
