package com.company;

import com.company.models.Almacen;

import java.util.Scanner;

public class Main {
    private static Scanner read = new Scanner(System.in);
    private static Almacen almacen = new Almacen();

    public static void main(String[] args) {
        mainmenu();
    }

    private static void mainmenu() {
        String prod = almacen.getProductoSeleccionado();
        String menu = "--------- INVENTARIO ---------\n" +
                "Producto seleccionado: " + (prod == null ? "ninguno" : prod) + "\n\n" +
                "1. Añadir nuevo producto\n" +
                "2. Incrementar stock\n" +
                "3. Reducir stock\n" +
                "4. Consultar stock\n" +
                "5. Consultar precio\n" +
                "6. Modificar precio\n" +
                "7. Salir";

        System.out.println(menu);
        int op = read.nextInt();
        read.nextLine();

        switch (op) {
            case 1:
                createProduct();
                break;
            case 2:
                addStock();
                break;
            case 3:
                remStock();
                break;
            case 4:
                checkStock();
                break;
            case 5:
                checkPrice();
                break;
            case 6:
                changePrice();
                break;
            default:
                break;
        }
    }

    private static void changePrice() {
        System.out.println();

        mainmenu();
    }

    private static void checkPrice() {
        System.out.println();

        mainmenu();
    }

    private static void checkStock() {
        System.out.println();

        mainmenu();
    }

    private static void remStock() {
        System.out.println();

        mainmenu();
    }

    private static void addStock() {
        System.out.println();

        mainmenu();
    }

    private static void createProduct() {
        System.out.println();

        mainmenu();
    }
}
