/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción:  Escribe un programa Java que suma independientemente los pares y los impares de los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
 */

package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int sumaPar=0,sumaImpar=0;
		
		for(int i=100;i<=200;i++) {
			if(i%2==0) {
				sumaPar+=i;
			}else {
				sumaImpar+=i;
			}
		}
		
		System.out.println("Suma de pares: "+sumaPar+"\nProducto: "+sumaImpar);

	}

}