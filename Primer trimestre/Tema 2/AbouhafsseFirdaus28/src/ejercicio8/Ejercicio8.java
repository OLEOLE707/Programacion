/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:16/10/2025
 * Descripción: Aplicación de senderismo
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Scanner
		Scanner scanner=new Scanner(System.in);
		
		//Variables
		String nombre, apellidos, ciudad, ciudadMayor="a";
		int edad, numRutas, participantes;
		double distanciaRuta, distanciaRutaFinal, media=0, distanciaMayor=0;
		
		//PEDIDA DE DATOS
		System.out.print("Introduzca su nombre: ");
		nombre=scanner.nextLine();
		
		System.out.print("Introduzca sus apellidos: ");
		apellidos=scanner.nextLine();
		
		//Si la edad no entra dentro de esos parámetros volvemos a preguntarla
		System.out.print("Introduzca su edad: ");
		edad=scanner.nextInt();
			
		while(edad>45 || edad<17) {
			System.out.println("\nEsa edad no es correcta");
			
			System.out.print("\nIntroduzca su edad: ");
			edad=scanner.nextInt();
		}
		
		System.out.print("Número de rutas realizadas: ");
		numRutas=scanner.nextInt();
		
		System.out.print("Introduzca la distancia de su última ruta(km): ");
		distanciaRutaFinal=scanner.nextDouble();
		
		System.out.println("\nAhora se te pediran los datos de 5 caminatas");

		//Datos de 5 caminatas
		for(int i=1;i<6;i++) {
			
			System.out.print("Introduzca la distancia de la caminata "+i+" : ");
			distanciaRuta=scanner.nextDouble();
			
			System.out.print("Introduzca el número de participantes de la caminata "+i+" : ");
			participantes=scanner.nextInt();
			
			//Para que no lea la linea siguiente
			scanner.nextLine();
			
			System.out.print("Introduzca la ciudad de la caminata "+i+" : ");
			ciudad=scanner.nextLine();

			
			System.out.println("\n");
			
			//sumamos todos los km
			media=distanciaRuta+media;
			
			//Aqui guardamos los datos de la distancia mayor anterior hasta que encuentre una más grande
			if(distanciaRuta>distanciaMayor){
				
				distanciaMayor=distanciaRuta;
				
				ciudadMayor =ciudad;
			}
			
		}
			
			//Resultados
			System.out.println("\n--------------------------------------------------");
			
			System.out.println("Nombre: "+nombre+" "+apellidos);
			System.out.println("Edad: "+edad);
			System.out.println("Número de rutas realizadas: "+numRutas);
			System.out.println("\n");
			System.out.println("Distancia media(5 últimas rutas): "+(media/5));
			System.out.println("Distancia más larga de las últimas 5 rutas: "+distanciaMayor);
			System.out.println("Ciudad de la ruta más larga: "+ciudadMayor);
			
			System.out.println("\n---------------------------------------------------");
			

		
	}

}
