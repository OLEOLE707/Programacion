/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 21/11/2025
* Contenido: Crear un metodo que al introducir un mes int devuelva una cadena de texto con la cantidad de dias que tiene
*
*/

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static String indicaMesDias(int mes) {
		String diasMes="";
		String[] meses= {"Nada","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		switch(mes) {
			case 1,3,5,7,8,10,12->{
				diasMes=meses[mes]+", 31 días";
			}
			case 2->{
				diasMes=meses[mes]+", 28 o 29 días";
			}
			case 4,6,9->{
				diasMes=meses[mes]+", 30 días";
			}
			default->{
				diasMes=meses[mes]+", 30 días";
			}
		}
		
		return diasMes;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int mes;
		
		System.out.print("Introduce el mes: ");
		mes=scanner.nextInt();
		
		
		while(mes<1||mes>12) {
			System.out.print("ERROR debe estar entre 1-12\n");
			System.out.print("Introduce el mes: ");
			mes=scanner.nextInt();
		}
		
		System.out.println(indicaMesDias(mes));

	}

}
