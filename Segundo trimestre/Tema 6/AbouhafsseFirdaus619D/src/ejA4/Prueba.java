/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Main de la clase Articulo
*
*/
package ejA4;

public class Prueba {

    public static void main(String[] args) {

        Articulo juguete;

        try {
            juguete = new Articulo("Play 4", 200.3, 200);
        } catch (IllegalArgumentException ex1) {
            System.out.println(ex1.getMessage() +
                    " Articulo creado con valores predeterminados= Nombre: a, Precio:0, cantidad: 0");
            juguete = new Articulo("a", 0, 0);
        }

        //Error nombre vacio
        try {
            juguete = new Articulo("", 200.3, 200);
        } catch (IllegalArgumentException ex1) {
            System.out.println(ex1.getMessage() +
                    " Articulo creado con valores predeterminados= Nombre: a, Precio:0, cantidad: 0");
            juguete = new Articulo("a", 0, 0);
        }

        System.out.println("\n--- INFORMACIÓN DEL ARTÍCULO ---");
        juguete.imprimirArticulo();

        //PVP
        System.out.println("\nPVP con IVA: " + juguete.getPVP() + " €");

        //PVP con descuento
        System.out.println("PVP con 10% de descuento: " + juguete.getPVPDescuento(10) + " €");

        //Vender artículos
        System.out.println("\n--- VENTA ---");
        if (juguete.vender(20)) {
            System.out.println("Venta realizada correctamente");
        } else {
            System.out.println("No hay stock suficiente");
        }
        juguete.imprimirArticulo();

        //Almacenar artículos
        System.out.println("\n--- ALMACÉN ---");
        if (juguete.almacenar(30)) {
            System.out.println("Productos almacenados correctamente");
        } else {
            System.out.println("No se pudo almacenar");
        }
        juguete.imprimirArticulo();
    }
}

