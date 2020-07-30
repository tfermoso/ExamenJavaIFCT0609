package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

        break;

}

        }while(opcion!=7);
    }
}
