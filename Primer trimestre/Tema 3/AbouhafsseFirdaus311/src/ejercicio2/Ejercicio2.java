/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 06/11/2025
 * Contenido: Matriz 10x10 con las tablas de multiplicar
 */

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		 int[][] matriz= new int[10][10];
		 
		 
		 for(int i=1; i<(matriz.length+1);i++) {
			 for(int j=1; j<(matriz.length+1);j++) {
				 matriz[i-1][j-1]=i*j;
			 } 
		 }

		 for(int i=1; i<(matriz.length+1);i++) {
			 for(int j=1; j<(matriz.length+1);j++) {
				 System.out.print(matriz[i-1][j-1]+"\t");
			 } 
			 System.out.println(" ");
		 }
	}

}
