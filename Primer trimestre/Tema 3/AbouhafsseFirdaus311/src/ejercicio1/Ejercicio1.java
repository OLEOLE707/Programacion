/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 06/11/2025
 * Contenido: Matriz 5x5 llena de 25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[][] matriz=new int[5][5];
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz.length; j++) {
				matriz[i][j]=25;
			}
		}
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0;j<matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
