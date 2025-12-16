/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 06/11/2025
* Contenido: Matriz nxm llenar por teclado y recorrerla para ver cuales son mayores o menors que 0
*/
	

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n, m, mayores=0, menores=0, iguales=0;
		int[][] matriz;
		
		System.out.print("Introduce el numero de filas: ");
		n=scanner.nextInt();
		
		System.out.print("Introduce el numero de columnas: ");
		m=scanner.nextInt();
		
		matriz= new int [n][m];
		
		//Filas
		 for(int i=0; i<n;i++) {
			 //Columnas
			 for(int j=0; j<m;j++) {
				 System.out.print("Introduce el numero de la posicion "+i+"x"+j+" :");
				 matriz[i][j]=scanner.nextInt();
			 } 
		 }
		 
		 
		 System.out.println("\n");
		 
		 for(int i=0; i<n;i++) {
			 
			 for(int j=0; j<m;j++) {
				 
				 if(matriz[i][j]>0) {
					 mayores++;
				 }else if(matriz[i][j]<0) {
					 menores++;
				 }else {
					 iguales++;
				 }
				 
				 System.out.print(matriz[i][j]+"\t");
			 } 
			 System.out.println("\n");
		 }
		 
		 System.out.println("Mayores que 0: "+mayores);
		 System.out.println("Menores que 0: "+menores);
		 System.out.println("Iguales que 0: "+iguales);

	}

}
