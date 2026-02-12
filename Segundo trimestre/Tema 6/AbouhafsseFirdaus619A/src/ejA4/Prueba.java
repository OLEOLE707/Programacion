/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Main de la clase Articulo
*
*/
package ejA4;

public class Prueba {

	public static void main(String[] args) {

		Articulo juguete = new Articulo();
		
		juguete.nombre="Play 4";
		juguete.precio=200;
		juguete.cuantosQuedan=50;
		
		System.out.println(juguete.nombre +" - Precio: "+ juguete.precio +" -  IVA:"+ juguete.IVA +"% - PVP: "+(juguete.precio-((juguete.precio*juguete.IVA)/100)));
		
		System.out.println("\nCambiamos el precio: +198€\n-----------------------------------");
		
		juguete.precio+=198;
		System.out.println(juguete.nombre +" - Precio: "+ juguete.precio +" -  IVA:"+ juguete.IVA +"% - PVP: "+(juguete.precio-((juguete.precio*juguete.IVA)/100)));

	}

}
