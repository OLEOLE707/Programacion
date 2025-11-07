/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Pedir un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media.
 */


package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		
		int n, masAltos=0, masBajos=0;
		
		System.out.print("Introduce n: ");
		n=scanner.nextInt();
		
		double altura[]=new double[n],minimo=100, maximo=0, media=0;
		
		for(int i=0;i<n;i++) {
			System.out.print("Introduce la altura en metros: ");
			altura[i]=scanner.nextDouble();
			
			media+=altura[i];
			
			if(maximo<altura[i]){
				maximo=altura[i];
			}
			
			if(minimo>altura[i]) {
				minimo=altura[i];
			}
		}
		
		media=media/n;
		
		
		for(int i=0;i<n;i++ ) {
			if(altura[i]<media) {
				masBajos++;
			}else if(altura[i]>media) {
				masAltos++;
			}
		}
		
		System.out.println("Mas altos: "+masAltos);
		System.out.println("Mas bajos: "+masBajos);

	}

}
