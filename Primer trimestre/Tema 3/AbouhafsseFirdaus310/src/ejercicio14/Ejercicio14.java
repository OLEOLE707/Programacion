/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido:Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 * muestre por pantalla.
 */

package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int contador=0, valor=1;
		int[] array=new int[55];
		
		while(contador<55) {
			for(int j=0; j<valor; j++) {
				array[contador]=valor;
				contador++;
			}
			valor++;
		}
		
		for(int i=0; i<55; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
