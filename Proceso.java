package Proceso;

public class Proceso {

    private int opcion;
    private int cantidad;
    private float subtotal;

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int SeleccionProducto() {
        switch (opcion) {
            case 1 ->
                System.out.println("\u001B[31mPrecio por litro: S/. 4.90");
            case 2 ->
                System.out.println("\u001B[31mPrecio por litro: S/. 4.80");
            case 3 ->
                System.out.println("\u001B[31mPrecio por litro: S/. 5.20");
            case 4 ->
                System.out.println("\u001B[31mPrecio por litro: S/. 4.60");
            default ->
                System.out.println("Opción no válida. Intente nuevamente.");
        }
        return opcion;
    }

    public float SubTotal() {
        switch (opcion) {
            case 1 ->
                subtotal = 4.90f * cantidad;
            case 2 ->
                subtotal = 4.80f * cantidad;
            case 3 ->
                subtotal = 5.20f * cantidad;
            case 4 ->
                subtotal = 4.60f * cantidad;
            default -> {
                System.out.println("Opción no válida. Intente nuevamente.");
                return 0.0f;
            }
        }

        return subtotal;
    }

    public float Descuento() {
        if (cantidad < 15) {
            return subtotal * 0.04f;
        } else if (cantidad >= 15 && cantidad < 30) {
            return subtotal * 0.065f;
        } else if (cantidad >= 30 && cantidad < 45) {
            return subtotal * 0.09f;
        } else if (cantidad >= 45) {
            return subtotal * 0.115f;
        } else {
            return 0;
        }
    }

    public float calcularTotal() {
        float descuento = Descuento();
        return subtotal - descuento;
    }
}
