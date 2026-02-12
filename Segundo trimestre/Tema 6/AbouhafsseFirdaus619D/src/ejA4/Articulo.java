/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Crea una clase Articulo
*
*/

package ejA4;

public class Articulo {
	
	//APARTADO A
    public static final double IVA = 21;

    private String nombre;
    private double precio;
    private int cuantosQuedan;

    
    //APARTADO B
    public Articulo(String nombre, double precio, int cuantosQuedan) {

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("ERROR: El nombre no puede estar vacío");
        }

        if (precio < 0) {
            throw new IllegalArgumentException("ERROR: Precio no válido");
        }

        if (cuantosQuedan < 0) {
            throw new IllegalArgumentException("ERROR: Cantidad no válida");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }
    
    
    //APARTADO C

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public static double getIVA() {
        return IVA;
    }

    // SETTERS
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("ERROR: El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("ERROR: Precio no válido");
        }
        this.precio = precio;
    }


    
    //APARTADO D

    // Imprime la información del artículo
    public void imprimirArticulo() {
        System.out.println("Artículo: " + nombre);
        System.out.println("Precio: " + precio + " €");
        System.out.println("IVA: " + IVA + " %");
        System.out.println("Stock: " + cuantosQuedan + " unidades");
    }

    // Devuelve el PVP con IVA incluido
    public double getPVP() {
        return precio + (precio * IVA / 100);
    }

    // Devuelve el PVP con descuento
    public double getPVPDescuento(double descuento) {
        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("ERROR: Descuento no válido");
        }
        return getPVP() - (getPVP() * descuento / 100);
    }

    // Vender una cantidad x
    public boolean vender(int cantidad) {
        if (cantidad <= 0 || cantidad > cuantosQuedan) {
            return false;
        }
        cuantosQuedan -= cantidad;
        return true;
    }

    // Almacenar una cantidad x
    public boolean almacenar(int cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        cuantosQuedan += cantidad;
        return true;
    }
}



