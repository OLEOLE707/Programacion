/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 26/11/2025
* Contenido: Programa que gestione las notas de diferentes alumnos hasta que se escriba fin
*
*/

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Importamos el escaner
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String nombre;
		double nota, media=0;
		int cantidadAlumnos=0;
		
		//Pedimos el nombre
		System.out.print("Introduce el nombre del alumno: ");
		nombre=scanner.nextLine();
		
		//Un bucle al que si no ingresamos fin no para
		while(!nombre.equals("fin")){
			
			//Pedimos las cuatro notas
			for(int i=1; i<=4; i++) {		

				System.out.print("Introduce la nota"+i+" : ");
				nota=scanner.nextDouble();
				
				while(nota<0.0 || nota>10.0) {
					System.out.println("NOTA INCORRECTA");
					
					System.out.print("Introduce la nota"+i+" : ");
					nota=scanner.nextDouble();
				}
				
					media+=nota;
			}
			
			//Hacemos la media
			media/=4;
			
			//Comprobamos si esta aprobado o suspenso
			if(media>=5) {
				System.out.println("Nombre: "+nombre+"\nMedia: "+media+"\nEstado: Aprobado");
			}else {
				System.out.println("Nombre: "+nombre+"\nMedia: "+media+"\nEstado: Suspenso");
			}
			
			//Contamos los alumnos introducidos
			cantidadAlumnos++;
			
			//Limpiamos el buffer
			scanner.nextLine();
			
			//Volvemos a pedir
			System.out.print("\nIntroduce el nombre del alumno: ");
			nombre=scanner.nextLine();
		}
		
		
		System.out.println("Cantidad de alumnos introducidos: "+cantidadAlumnos);

	}

}
