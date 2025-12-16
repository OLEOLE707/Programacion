/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/11/2025
* Contenido: Pedir un número entero por teclado y muestre por pantalla si es positivo, negativo o cero
* 
*/

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static int dimeSigno(int a) { // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
		
		int signo;
		
		if(a>0) {
			signo=1;
		}else if(a<0) {
			signo=-1;
		}else {
			signo=0;
		}
		
		return signo;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int a;
		
		System.out.print("Introduce a: ");
		a=scanner.nextInt();

		
		if (dimeSigno(a)==1) {
			System.out.println("Tu número es positivo");
		}else if (dimeSigno(a)==-1){
			System.out.println("Tu número es negativo");
		}else {
			System.out.println("Tu número es 0");
		}
	}

}