/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:23/10/2025
 * Descripción: Tirar un dado de 6 caras 100 veces y luego muestre el nº y % de veces que ha salido cada número.

 */

package ejercicio13;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int tirada, uno=0, dos=0, tres=0, cuatro=0, cinco=0, seis=0;
		
		for(int i=0; i<100; i++) {
			tirada=(int)(Math.random()*6)+1;
			
			switch(tirada) {
				case 1:{
					uno++;
					break;
				}
				case 2:{
					dos++;
					break;
				}
				case 3:{
					tres++;
					break;
				}
				case 4:{
					cuatro++;
					break;
				}
				case 5:{
					cinco++;
					break;
				}
				case 6:{
					seis++;
					break;
				}
				default:{
					System.out.println("ERROR");
				}
			}
			
		}
		
		System.out.println("El 1 ha salido: "+uno+" veces: "+uno+"%");
		System.out.println("El 2 ha salido: "+dos+" veces: "+dos+"%");
		System.out.println("El 3 ha salido: "+tres+" veces: "+tres+"%");
		System.out.println("El 4 ha salido: "+cuatro+" veces: "+cuatro+"%");
		System.out.println("El 5 ha salido: "+cinco+" veces: "+cinco+"%");
		System.out.println("El 6 ha salido: "+seis+" veces: "+seis+"%");
		

	}

}
