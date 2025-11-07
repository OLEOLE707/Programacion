/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 31/10/2025
 * Contenido: Igual que el ejercicio 14 pero con array fill
 */

package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		int[] array=new int[55];
		int num=1, inicio=0, fin=1;
		

		
		for(int i=0; i<10; i++) {
			
			Arrays.fill(array, inicio, fin, num);
			num++;
			
			inicio=fin;
			
			fin = fin+num;

		}
		
		
		
		System.out.println(Arrays.toString(array));

	}

}
