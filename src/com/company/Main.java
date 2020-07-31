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
                int unidades;
                //TODO
                switch (opcion) {
                    case 1:
                        System.out.println("¿Nº.Referencia producto?");
                        ref = leer.nextLine();
                        System.out.println("¿Precio producto?");
                        precio=leer.nextDouble();
                        System.out.println("¿Stock del producto?");
                        stock=leer.nextInt();
                        leer.nextLine();
                        almacen.añadirProducto(ref, precio, stock);

                        break;

                    case 2:
                        System.out.println("¿Nº.Referencia producto?");
                        ref=leer.nextLine();
                        System.out.println("¿cuanto stock hay a añadir?");
                        stock=leer.nextInt();
                        leer.nextLine();
                        almacen.seleccionarProducto(ref);
                        almacen.aumentarStock(stock);
                        break;

                    case 3:
                        System.out.println("¿Nº.Referencia producto?");
                        ref=leer.nextLine();
                        System.out.println("¿Cuanto stock hay que quitar");
                        stock=leer.nextInt();
                        leer.nextLine();
                        almacen.seleccionarProducto(ref);
                        almacen.quitarStock(stock);
                        break;

                    case 4:

                        break;
                    case 5:

                        break;

                    case 6:

                        break;

                    case 7:

                        break;
                }
            } while (opcion != 7) ;
        }
}
