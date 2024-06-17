package Reporte;

import IngresarDatos.IngresarDatos;
import Proceso.Proceso;

public class Reporte {

    static Proceso obj = new Proceso();

    public static void main(String[] args) {

        int opcion, cantidad;
        float subtotal;
        
        opcion = IngresarDatos.LeerProducto();
        cantidad = IngresarDatos.LeerCantidad();

        obj.setOpcion(opcion);
        obj.setCantidad(cantidad);
        obj.SeleccionProducto();
        subtotal = (float) obj.SubTotal();
        float descuento = obj.Descuento();
        float total = obj.calcularTotal();

        mostrar(subtotal, descuento, total);
    }

    public static void mostrar(float subtotal, float descuento, float total) {
        System.out.println("\u001B[31mCantidad de producto: " + obj.getCantidad());
        System.out.printf("\u001B[31mImporte de compra: S/.%5.2f%n", subtotal);
        System.out.printf("\u001B[31mImporte de descuento: S/.%5.2f%n", descuento);
        System.out.printf("\u001B[31mImporte total: S/.%5.2f%n", total);
    }
}
