package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Almacen almacen=new Almacen();
        Scanner leer=new Scanner(System.in);
        String menu="Gestión Inventario\n" +
                "1. Añadir nuevo producto al almacén\n" +
                "2. Incrementar stock\n" +
                "3. Retirar unidades\n" +
                "4. Consular precio\n" +
                "5. Consultar stock\n" +
                "6. Modificar precio\n" +
                "7. Mostrar producto\n" +
                "8. Salir";
        int opcion,stock;
        String referencia;
        double precio;
        do{
            System.out.println(menu);
            opcion=leer.nextInt();
            leer.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Referencia:");
                    referencia=leer.nextLine();
                    System.out.println("Precio:");
                    precio=leer.nextDouble();
                    leer.nextLine();
                    System.out.println("Stock:");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.nuevoProducto(referencia,precio,stock);
                    break;
                case 2:
                    seleccionarReferencia(leer,almacen);
                    System.out.println("Unidades a incrementar");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.incrementarStock(stock);
                    break;
                case 3:
                    seleccionarReferencia(leer,almacen);
                    System.out.println("Unidades a retirar:");
                    stock=leer.nextInt();
                    leer.nextLine();
                    almacen.retirarProducto(stock);
                    break;
                case 4:
                    seleccionarReferencia(leer,almacen);
                    System.out.println("El precio es: "+almacen.consultarPrecio() );
                    break;
                case 5:
                    seleccionarReferencia(leer,almacen);
                    System.out.println("El stock es: "+almacen.consultarStock() );
                    break;
                case 6:
                    seleccionarReferencia(leer,almacen);
                    System.out.println("Nuevo precio: ");
                    precio=leer.nextDouble();
                    leer.nextLine();
                    almacen.modificarPrecio(precio);
                    break;
                case 7:
                    seleccionarReferencia(leer,almacen);
                    System.out.println(almacen.mostrarProducto());
                    break;

            }

        }while(opcion!=8);
    }

    public  static void seleccionarReferencia(Scanner leer,Almacen almacen){
        System.out.println("Referencia:");
        String referencia=leer.nextLine();
        almacen.seleccionarProducto(referencia);
    }
}
