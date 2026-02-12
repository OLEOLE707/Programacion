	/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 07/11/2025
* Contenido: Mostrar por pantalla cuantas vocales de cada tipo hay en una frase introducida por teclado sin distinguir mayusculas o minusculas;
*/


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=0,e=0,i=0,o=0,u=0;
		String texto;
		char letra;

		
		System.out.print("Introduce la frase: ");
		texto=scanner.nextLine();
		
		texto=texto.toLowerCase();
		
		for(int x=0; x<texto.length();x++) {
			letra=texto.charAt(x);
			
			switch(letra) {
				case 'a'->{
					a++;
				}
				case 'e'->{
					e++;
				}
				case 'i'->{
					i++;
				}
				case 'o'->{
					o++;
				}
				case 'u'->{
					u++;
				}
				default->{
					break;
				}
			}
		}
		
		System.out.println("Nº de A's: "+a);
		System.out.println("Nº de E's: "+e);
		System.out.println("Nº de I's: "+i);
		System.out.println("Nº de O's: "+u);
		System.out.println("Nº de U's: "+o);
		

	}

}
