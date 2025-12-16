/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 18/11/2025
* Contenido: Escribe un programa que pida un valor N entero y luego muestre: el sumatorio desde 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N
*/


package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static int suma1aN(int n) { // Devuelve la suma de enteros de 1 a n
		int sumatorio=0;
		
		for(int i=1;i<=n;i++) {
			sumatorio+=i;
		}
		
		return sumatorio;
	}
	public static int producto1aN(int n) { // Devuelve el producto de enteros de 1 a n
		int producto=1;
		
		for(int i=1;i<=n;i++) {
			producto*=i;
		}
		
		return producto;
		
	}
	public static double intermedio1aN(int n) { // Devuelve el valor intermedio entre 1 y n
		int sumatorio=0;
		
		for(int i=1;i<=n;i++) {
			sumatorio+=i;
		}
		
		return sumatorio/n;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Introduce n: ");
		n=scanner.nextInt();
		
		
		System.out.println("La suma de 1 a "+n+" es: "+suma1aN(n));
		System.out.println("El producto de 1 a "+n+" es: "+producto1aN(n));
		System.out.println("El número intermedio entre 1 a "+n+" es: "+intermedio1aN(n));

	}

}
