package IngresarDatos;

import java.util.Scanner;

public class IngresarDatos {

    public static int LeerProducto() {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\u001B[34m-----------El Gallito emprendedor-----------");
            System.out.println("\u001B[34mSeleccione el número del producto que desea:");
            System.out.println("1. Buena vida");
            System.out.println("2. Pura salud");
            System.out.println("3. Todo Sabor");
            System.out.println("4. Cielo");
            opcion = teclado.nextInt();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static int LeerCantidad() {
        int cantidad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\u001B[34mIngrese cantidad del producto:");
        cantidad = teclado.nextInt();
        return cantidad;
    }
}
