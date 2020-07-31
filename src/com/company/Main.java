package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leer = new Scanner(System.in);
        Almacen productos = new Almacen() {
        };

        //String menuP = "Gestión de inventario \n" +
        //"1. Crear producto \n" +
        //"2. Seleccionar producto \n" +
        //"8. Salir \n";


        String menu = "Gestión Inventario\n" +
                "1. Añadir nuevo producto al almacén\n" +
                "2. Mostrar producto \n" +
                "3. Incrementar stock\n" +
                "4. Retirar unidades\n" +
                "5. Consultar stock\n" +
                "6. Consultar precio\n" +
                "7. Modificar precio\n" +
                "8. Salir\n";

        int opcion;
        do {
            //if (productos.productoSeleccionado()) {
            //System.out.println(menu);
            //} else {
            //System.out.println(menuP);
            //}

            System.out.println(menu);
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {

                case 1:

                    System.out.println("Añadir nuevo producto: ");
                    String referencia = leer.nextLine();
                    System.out.println("El precio es de:  " +" €");
                    double precio = leer.nextDouble();
                    leer.nextLine();
                    System.out.println("Las unidades son: ");
                    int stock = leer.nextInt();
                    leer.nextLine();
                    productos.nuevoProducto(referencia, precio, stock);
                    break;

                case 2:

                    System.out.println("Seleccionar producto: ");
                    String referencia1 = leer.nextLine();
                    Scanner referencias=new Scanner(System.in);
                    productos.seleccionarProducto(referencia1);
                    System.out.println("El producto seleccionado es: ");
                    System.out.println(productos.consultarStock() );
                    break;


                case 3:

                    System.out.println("Incrementar stock: ");
                    int stocks = leer.nextInt();
                    leer.nextLine();
                    productos.incrementarStock(stocks);
                    break;

                case 4:

                    System.out.println("Retirar stock: ");
                    stocks = leer.nextInt();
                    leer.nextLine();
                    productos.retirarProducto(stocks);
                    break;

                case 5:

                    System.out.println("Consultar stock: ");
                    System.out.println(productos.consultarStock() + "unidades");
                    break;

                case 6:

                    System.out.println("Consultar precio: ");
                    System.out.println(productos.consultarPrecio() + "€");
                    break;

                case 7:

                    double[][] precios = productos.modificarPrecio();
                    for (int i = 0; i < precios.length; i++) {
                        System.out.println("Referencia: " + precios[i][0] +
                                ", Nuevo precio: " + precios[i][1] +
                                ", Unidades: " + precios[1][2]);
                        break;
                    }
                case 8:

                    System.out.println("Estado actualizado");
                    ;
                    break;

                default:

                    System.out.println("Registro no válido");
                    break;


            }


        } while (opcion != 7);
    }

    //private static void mostrarResultadoUltimaOperacion(Almacen productos) {
        //if ((productos.resultadoUltimaOperacion())) {
            //System.out.println("Registro realizado con éxito");
        //} else {
            //System.out.println("Error al realizar el registro");

        //}
        //}

        //private void registrarProducto(double referencia, double precio, int stock) {//array
        //int contador = 0;
        //double[][] precios = new double[0][];
        //if (contador < 4) {
        //precios[contador][0] = referencia;
        //precios[contador][1] = precio;
        //precios[contador][2] = stock;

        //contador++;

        //} else {
        //for (int i = 1; i < precios.length; i++) {
        //precios[i - 1][0] = precios[i][0];
        //precios[i - 1][1] = precios[i][1];
        //precios[i - 1][2] = precios[i][2];

        //}
        //contador = 3;
        //registrarProducto(referencia, precio, stock);

        //}
    }


