/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción:Dada una cantidad de euros que el usuario introduce por teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha cantidad
 * (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). 
 * Hay que indicar el mínimo de billetes posible.
 */

package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int cantidad, quinientos=0,doscientos=0,cien=0,cincuenta=0,veinte=0,diez=0,cinco=0;
		
		System.out.print("Introduce la cantidad: ");
		cantidad = scanner.nextInt();
		
		while(cantidad==0||cantidad%5!=0) {
			System.out.println("Cantidad incorrecta, ha de ser múltiplo de 5 y mayor que 0");

			System.out.print("Introduce la cantidad: ");
			cantidad = scanner.nextInt();
		}
		
		System.out.println("La cantidad "+cantidad+"€, puede ser dividida en: ");
		
		while(cantidad!=0) {
			
			if(cantidad%500==0){
				cantidad-=500;
				quinientos++;
				
			}else if(cantidad%200==0) {
				cantidad-=200;
				doscientos++;
				
			}else if(cantidad%100==0) {
				cantidad-=100;
				cien++;			
				
			}else if(cantidad%50==0){
				cantidad-=50;
				cincuenta++;
				
			}else if(cantidad%20==0) {
				cantidad-=20;
				veinte++;
				
			}else if(cantidad%10==0) {
				cantidad-=10;
				diez++;
				
			}else{
				cantidad-=5;
				cinco++;
				
			}
		}
		

		
		if(quinientos!=0){
			System.out.println(quinientos+" billetes de 500€");
		}
			
		if(doscientos!=0){
			System.out.println(doscientos+" billetes de 200€");
		}
		
		if(cien!=0){
			System.out.println(cien+" billetes de 100€");
		}
		
		if(cincuenta!=0){
			System.out.println(cincuenta+" billetes de 50€");
		}
		
		if(veinte!=0){
			System.out.println(veinte+" billetes de 20€");
		}
		
		if(diez!=0){
			System.out.println(diez+" billetes de 10€");
		}
		
		if(cinco!=0){
			System.out.println(cinco+" billetes de 5€");
		}
	}

}
