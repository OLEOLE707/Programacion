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
			juguete = new Articulo("Play 4", 200.3, Articulo.IVA, 200);

		} catch (IllegalArgumentException ex1) {

			System.out.println(ex1.getMessage()
					+ " Articulo creado con valores predeterminados= Nombre: a, Precio:0, cantidad: 0");

			juguete = new Articulo("a", 0, Articulo.IVA, 0);
		}

		// Va a dar error de nombre vacío
		try {
			juguete = new Articulo("", 200.3, Articulo.IVA, 200);

		} catch (IllegalArgumentException ex1) {

			System.out.println(ex1.getMessage()
					+ " Articulo creado con valores predeterminados= Nombre: a, Precio:0, cantidad: 0");

			juguete = new Articulo("a", 0, Articulo.IVA, 0);
		}

		// Usamos SETTERS
		juguete.setNombre("Play 4");
		juguete.setPrecio(200);
		Articulo.setCuantosQuedan(50);

		
		// Usamos GETTERS
		System.out.println(juguete.getNombre() + " - Precio: " + juguete.getPrecio() + " - IVA: " + Articulo.getIVA()
				+ "% - PVP: " + (juguete.getPrecio() - ((juguete.getPrecio() * Articulo.getIVA()) / 100)));

		System.out.println("\nCambiamos el precio: +198€\n-----------------------------------");

		juguete.setPrecio(juguete.getPrecio() + 198);

		System.out.println(juguete.getNombre() + " - Precio: " + juguete.getPrecio() + " - IVA: " + Articulo.getIVA()
				+ "% - PVP: " + (juguete.getPrecio() - ((juguete.getPrecio() * Articulo.getIVA()) / 100)));
	}
}
