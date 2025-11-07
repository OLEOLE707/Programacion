/*
 * Descripción: Realizar un control de compras y ofrecer un vale si supera la cantidad de 300€ en un mes
 * Autor: Firdaus Abouhafsse
 * Fecha:03/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nombre, apellidos; 
		double importeGastado1, importeGastado2 ,importeGastado3 ,importeGastado4, mediaImportes,sumaImportes;
		
		//Pedida de datos
		System.out.print("Introduce tu nombre: ");
		nombre=scanner.nextLine();

		System.out.print("Introduce tus apellidos: ");
		apellidos=scanner.nextLine();
		
		System.out.print("Introduce el primer importe gastado: ");
		importeGastado1=scanner.nextDouble();
		
		System.out.print("Introduce el segundo importe gastado: ");
		importeGastado2=scanner.nextDouble();
		
		System.out.print("Introduce el tercer importe gastado: ");
		importeGastado3=scanner.nextDouble();
		
		System.out.print("Introduce el cuarto importe gastado: ");
		importeGastado4=scanner.nextDouble();
		
		
		//Calculamos la suma y media
		sumaImportes=importeGastado1+importeGastado2+importeGastado3+importeGastado4;
		mediaImportes=sumaImportes/4;
		
		//Mostramos la media
		System.out.println("\nImporte medio: "+mediaImportes);
		
		
		if(sumaImportes>=300) {
			System.out.println("\n¡¡FELICIDADES!! sus compras han alcanzado los 300 euros, le pertenece el descuento de 30€ ");
		}else {
			System.out.println("\nLo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
		}

	}

}
