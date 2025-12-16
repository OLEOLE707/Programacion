/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 25/11/2025
* Contenido: Crear un método que recibe como parámetro un número entero y devuelve una cadena de texto.
* Comprobaremos que el número se encuentra entre 1 y 16 y preguntaremos el nombre.
*
*/

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static String posicionJugador(int n, String nombre) { //Recibe como parámetro un número entero y devuelve una cadena de texto
		
		String cadena="";

		switch(n) {
			case 1:{
				cadena=nombre+", con el dorsal "+n+" juega el próximo partido como portero.";
				break;
			}
			case 2, 3, 4, 5:{
				cadena=nombre+", con el dorsal "+n+" juega el próximo partido como defensa.";
				break;
			}
			case 6, 7, 8:{
				cadena=nombre+", con el dorsal "+n+" juega el próximo partido como centrocampista.";
				break;
			}
			case 9, 10, 11:{
				cadena=nombre+", con el dorsal "+n+" juega el próximo partido como delantero.";
				break;
			}
			case 12, 13, 14, 15,16:{
				cadena=nombre+", con el dorsal "+n+" juega el próximo partido como suplente.";
				break;
			}
			default:{
				cadena="Número introducido incorrecto";
			}
		}
		
		return cadena;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int posicion;
		String nombre;
		
		System.out.println("1-Portero,\r\n"
				+ "del 2 al 5 defensas,\r\n"
				+ "6 al 8 centrocampistas,\r\n"
				+ "del 9 al 11 delanteros,\r\n"
				+ "del 12 al 16 suplentes.");

		System.out.print("\nIntroduce la posicion: ");
		posicion=scanner.nextInt();
		
		
		if(posicion<1 ||posicion>16) {
			System.out.println("Número introducido incorrecto.");

		}else {
			scanner.nextLine();
			System.out.print("Introduce el nombre del jugador: ");
			nombre=scanner.nextLine();
			
			System.out.println(posicionJugador(posicion, nombre));
		}	
		
	}

}
