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
			juguete = new Articulo("Play 4", 200.3,  Articulo.IVA, 200);
		
		}catch( IllegalArgumentException ex1) {
			
			System.out.println(ex1.getMessage()+" Articulo creado con valores predeterminados= Nombre: a, Precio:0, cantidad: 0");
		
			juguete = new Articulo("a", 0, Articulo.IVA , 0);
		}
		
		//Va a dar error de nombre vacio
		try {
			juguete = new Articulo("", 200.3,  Articulo.IVA, 200);
		
		}catch( IllegalArgumentException ex1) {
			
			System.out.println(ex1.getMessage()+" Articulo creado con valores predeterminados= Nombre: a, Precio:0, cantidad: 0");
		
			juguete = new Articulo("a", 0, Articulo.IVA , 0);
		}
		
		//Va a dar error de precio
		
		
		juguete.nombre="Play 4";
		juguete.precio=200;
		juguete.cuantosQuedan=50;
		
		System.out.println(juguete.nombre +" - Precio: "+ juguete.precio +" -  IVA:"+ juguete.IVA +"% - PVP: "+(juguete.precio-((juguete.precio*juguete.IVA)/100)));
		
		System.out.println("\nCambiamos el precio: +198€\n-----------------------------------");
		
		juguete.precio+=198;
		System.out.println(juguete.nombre +" - Precio: "+ juguete.precio +" -  IVA:"+ juguete.IVA +"% - PVP: "+(juguete.precio-((juguete.precio*juguete.IVA)/100)));

	}

}
