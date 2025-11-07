/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:08/10/2025
 * Descripción: Realizar la nota media de cuatro asignaturas, redondearla y truncarla y comprobar si es mayor que 8 
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);		
		
		//Creamos las variables
		double nota1, nota2, nota3, nota4,media;
		
		
		//Pedimos los datos al usuario
		System.out.print("Introduce tu primera nota: ");
		nota1= scanner.nextDouble();
		
		System.out.print("Introduce tu segunda nota: ");
		nota2= scanner.nextDouble();
		
		System.out.print("Introduce tu tercera nota: ");
		nota3= scanner.nextDouble();
		
		System.out.print("Introduce tu cuarta nota: ");
		nota4= scanner.nextDouble();
		
		//Calcular la nota media
		media=(nota1+nota2+nota3+nota4)/4;
		
		//Mostrarla
		System.out.println("\nTu nota media es : "+media);
		System.out.println("Tu nota media redondeada hacia arriba es : "+(double)Math.round(media));
		System.out.println("Tu nota media redondeada hacia abajo es : "+Math.floor(media));
		
		//Condición
		if(media>8) {
			System.out.println("\n¡Felicidades, podras acceder a estudios superiores!");
		}else {
			System.out.println("\nLo sentimos no podras acceder a estudios superiores");
		}
		
		
	}

}
