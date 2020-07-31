package com.company;

import com.company.models.Almacen;
import com.company.models.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner read = new Scanner(System.in);
    private static Almacen almacen = new Almacen();

    public static void main(String[] args) {
        try {
            mainmenu();
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción en el programa y se ha cerrado forzosamente");
        }
    }

    private static void mainmenu() {
        String prod = "";
        if (almacen.getProductoSeleccionado() != null) {
            prod = almacen.getProductoSeleccionado().getReferencia();
        }
        String menu = "--------- INVENTARIO ---------\n" +
                "Producto seleccionado: " + (prod.equals("") ? "ninguno" : prod) + "\n\n" +
                "1. Añadir nuevo producto\n" +
                "2. Listar productos\n" +
                "3. Seleccionar producto\n" +
                "4. Incrementar stock\n" +
                "5. Reducir stock\n" +
                "6. Consultar stock\n" +
                "7. Consultar precio\n" +
                "8. Modificar precio\n" +
                "9. Salir";

        System.out.println(menu);
        int op = read.nextInt();
        read.nextLine();
        System.out.println();

        switch (op) {
            case 1:
                createProduct();
                break;
            case 2:
                listProducts();
                break;
            case 3:
                selectProduct();
                break;
            case 4:
                addStock();
                break;
            case 5:
                remStock();
                break;
            case 6:
                checkStock();
                break;
            case 7:
                checkPrice();
                break;
            case 8:
                changePrice();
                break;
            default:
                break;
        }
    }

    private static void changePrice() {
        System.out.print("Introduzca el nuevo precio del producto: ");
        String p0 = read.next();
        double p = isCorrectNumberFormat(p0);
        read.nextLine();
        almacen.modificarPrecio(p);
        System.out.println("Se ha modificado el precio correctamente");
        System.out.println();
        mainmenu();
    }

    private static void checkPrice() {
        String val = String.format("%.2f", almacen.getProductoSeleccionado().getPrecio());
        System.out.println("El precio del producto seleccionado es: " + val + "€");
        System.out.println();
        mainmenu();
    }

    private static void checkStock() {
        System.out.println("El stock del producto seleccionado es: " + almacen.getProductoSeleccionado().getStock() + " unidad(es)");
        System.out.println();
        mainmenu();
    }

    private static void remStock() {
        System.out.print("Introduzca la cantidad de stock que desea retirar del producto: ");
        String s0 = read.next();
        int s = (int) isCorrectNumberFormat(s0);
        read.nextLine();
        almacen.retirarProducto(s);
        System.out.println("Se ha retirado el stock correctamente");
        System.out.println();
        mainmenu();
    }

    private static void addStock() {
        System.out.print("Introduzca la cantidad de stock que desea añadir del producto: ");
        String s0 = read.next();
        int s = (int) isCorrectNumberFormat(s0);
        read.nextLine();
        almacen.incrementarStock(s);
        System.out.println("Se ha añadido el stock correctamente");
        System.out.println();
        mainmenu();
    }

    private static void selectProduct() {
        System.out.print("Introduzca la referencia del producto que desea seleccionar: ");
        String r = read.next();
        read.nextLine();
        almacen.seleccionarProducto(r);
        System.out.println();
        mainmenu();
    }

    private static void listProducts() {
        ArrayList<Producto> productos = almacen.getProductos();
        if (productos.size() == 0) {
            System.out.println("El almacén está vacío");
        } else {
            StringBuilder s = new StringBuilder("En el almacén hay los siguientes productos:\n");
            for (Producto p : productos) {
                s.append("Ref: ").append(p.getReferencia()).append("\n");
            }
            s.delete(s.length() - 1, s.length());
            System.out.println(s);
        }
        System.out.println();
        mainmenu();
    }

    private static void createProduct() {
        System.out.print("Introduzca la referencia del nuevo producto: ");
        String r = read.next();
        read.nextLine();
        System.out.print("Introduzca el precio del nuevo producto: ");
        String p0 = read.next();
        double p = isCorrectNumberFormat(p0);
        read.nextLine();
        System.out.print("Introduzca el stock del nuevo producto: ");
        String s0 = read.next();
        int s = (int) isCorrectNumberFormat(s0);
        read.nextLine();
        almacen.nuevoProducto(r, p, s);
        System.out.println();
        System.out.println("Se ha creado el producto con referencia " + r + " correctamente");
        System.out.println();
        mainmenu();
    }

    private static double isCorrectNumberFormat(String s) {
        if (!isNumber(s)) {
            System.out.println("El número que ha introducido no tiene un formato válido");
            System.out.println();
            mainmenu();
        }
        return Double.parseDouble(s);
    }

    private static boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
