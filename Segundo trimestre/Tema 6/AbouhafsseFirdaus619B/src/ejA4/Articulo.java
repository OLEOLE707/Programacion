/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Crea una clase Articulo
*
*/

package ejA4;

public class Articulo {
	
	public static final double IVA=21;
	
	static int cuantosQuedan;
	
	String nombre;
	double precio;
	
	public Articulo( String nombre, double precio, double IVA, int cuantosQuedan) throws IllegalArgumentException {
		
		if(nombre.isEmpty()) {
			throw new IllegalArgumentException("ERROR: El nombre no puede estar vacío");
		}
		
		if(precio<0) {
			throw new IllegalArgumentException("ERROR: Precio no válido");			
		}
		
		if (IVA!=21) {
			throw new IllegalArgumentException("ERROR: El IVA debe ser 21");
		}
		
		if(cuantosQuedan<0) {
			throw new IllegalArgumentException("ERROR: Cantidad no válida");			
		}
		
		this.nombre=nombre;
		this.precio=precio;
		this.cuantosQuedan=cuantosQuedan;
		
	}
	
	
}



