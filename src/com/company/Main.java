package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Almacen almacen=new Almacen();
        // write your code here
        Scanner leer=new Scanner(System.in);
        String menu="Gestión Inventario\n" +
                "1. Añadir nuevo producto al almacén\n" +
                "2. Incrementar stock\n" +
                "3. Retirar unidades\n" +
                "4. Consular precio\n" +
                "5. Consultar stock\n" +
                "6. Modificar precio\n" +
                "7. Salir";
        int opcion;
        do{
            System.out.println(menu);
            opcion=leer.nextInt();
            leer.nextLine();
           switch (opcion){
               case 1:

                   System.out.println("Añade nuevo producto al almacen--");
                   System.out.println("Escribe la Referencia del producto");
                   String referencia=leer.nextLine();
                   System.out.println("Escribe las precio del producto");
                   double precio=leer.nextDouble();
                   leer.nextLine();
                   System.out.println("Introduce las unidades ");
                   int unidades=leer.nextInt();
                   leer.nextLine();
                   almacen.nuevoProducto(referencia,precio,unidades);

                   break;

               case 2:
                   break;

               case 3:
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

        }while(opcion!=7);
    }
}
