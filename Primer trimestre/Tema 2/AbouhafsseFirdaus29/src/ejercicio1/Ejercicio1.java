/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Mostrar los primeros número naturales
 */


package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<21;i++) {
			
			if(i==20) {
				System.out.print(i+")");
			}else if(i==1) {
				System.out.print("("+i+", ");
			}else {
				System.out.print(i+", ");
			}
		
		}

	}

}
