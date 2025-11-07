/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 07/11/2025
* Contenido: Calcular brecha salarial entree hombres y mujeres
*/

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n, numMujeres=0, numHombres=0;
		double sueldo, sueldoMujer=0, sueldoHombre=0;
		double[][] matriz;
		
		System.out.print("Introduce el número de personas a entrevistar: ");
		n=scanner.nextInt();

		matriz = new double [n][2];
		
		//Introducimos los valores de la matriz
		 for(int i=0; i<n;i++) {
			 System.out.println("\nEntrevistado "+(i+1));
			 
			 for(int j=0; j<2;j++) {
				
				 if(j==0) {
					 System.out.print("Introduce el género del entrevistado (0=Varón y 1=Mujer) : ");
					 matriz[i][j]=scanner.nextDouble();
					 
					 while(matriz[i][j]!=0 && matriz[i][j]!=1) {
						 System.out.println("\nGénero no válido intente otra vez: ");
						 System.out.print("Introduce el género del entrevistado (0=Varón y 1=Mujer) : ");
						 matriz[i][j]=scanner.nextDouble();
					 }
					  
					 
				 }else if(j==1) {
					 System.out.print("Introduce el salario del entrevistado nº : ");
					 matriz[i][j]=scanner.nextDouble();
				 } 
			 }
			 
			 if(matriz[i][0]==0) {
				 numHombres++;
				 sueldoHombre+=matriz[i][1];
			 }else if(matriz[i][0]==1) {
				 numMujeres++;
				 sueldoMujer+=matriz[i][1];
			 }
		 }
		 
		 
		 System.out.println("\nEl sueldo medio de los hombres es: "+(sueldoHombre/numHombres));
		 System.out.println("El sueldo medio de las mujeres es: "+(sueldoMujer/numMujeres));
		 
		 
		 
	}

}
