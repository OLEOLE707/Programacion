/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:21/10/2025
 * Descripción: Escribe un programa que ordene tres números enteros introducidos por teclado.
 */


package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num1,num2,num3, primer, segun, tercer;
		
		System.out.print("Numero 1: ");
		num1=scanner.nextDouble();
		
		System.out.print("Numero 2: ");
		num2=scanner.nextDouble();
		
		System.out.print("Numero 3: ");
		num3=scanner.nextDouble();
		
		if(num1>num2 && num1>num3) {
			primer=num1;
			if(num2>num3) {
				segun=num2;
				tercer=num3;
			}else {
				segun=num3;
				tercer=num2;
			}
			
		}else if(num2>num1 && num2>num3){
			primer=num2;
			if(num1>num3) {
				segun=num1;
				tercer=num3;
			}else {
				segun=num3;
				tercer=num1;
			}
		}else{
			primer=num3;
			if(num1>num2) {
				segun=num1;
				tercer=num2;
			}else {
				segun=num2;
				tercer=num1;
			}
		}
		
		System.out.println("Tus números ordenados son: "+primer+ ", "+segun+", "+tercer+".");
		
	}

}
