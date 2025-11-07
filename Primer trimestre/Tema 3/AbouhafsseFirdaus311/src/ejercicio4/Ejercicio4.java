/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 06/11/2025
* Contenido: Matriz 4 alumnos x 5 asignaturas y mostrar nota minima maxima y media
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[][] notas = new double [4][5];
		double minimo,maximo=0;
		double media=0;
		
		
		 for(int i=0; i<4;i++) {
			 System.out.println("\nAlumno "+(i+1));
			 
			 for(int j=0; j<5;j++) {
				
				 System.out.print("Introduce la nota "+(j+1)+" del alumno "+(i+1)+" :");
				 notas[i][j]=scanner.nextDouble();
			 } 
		 }
		 
		 minimo=notas[0][0];
		 
		 for(int i=0; i<4;i++) {
			 System.out.println("\nAlumno "+(i+1));
			 for(int j=0; j<5;j++) {
				 if(maximo<notas[i][j]) {
					 maximo=notas[i][j];
					 
				 }else if(minimo>notas[i][j]) {
					 minimo=notas[i][j];
				 }
				 media+=notas[i][j];
			 }
			 
			 
				System.out.println("Nota minima: "+minimo);
				System.out.println("Nota maxima: "+maximo);
				System.out.println("Nota media: "+(media/5));
				
				//Reiniciamos para cada alumno
				minimo=notas[0][0];
				maximo=0;
				media=0;
		 }


	}

}
