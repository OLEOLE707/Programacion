/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 21/11/2025
* Contenido: Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”. pedir al usuario que introduzca un radio y luego se le mostrará el cálculo elegido
*
*/


package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {
	
	public static int menu(int opcion) { // Muestra el menú y devuelve el número elegido
		Scanner scanner = new Scanner(System.in);
		
		//Creamos el menu
		System.out.println("\nMENU DE OPCIONES");
		System.out.println("----------------");
		System.out.println("1.Circunferencia\n2.Área\n3.Volumen\n4.Todas\n5.Salir\n");
		
		System.out.print("Elige la opcion: ");
		opcion=scanner.nextInt();
		
		return opcion;
	}
	
	public static double pideRadio(double radio) {// Pide que se introduzca el radio y lo devuelve
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el radio: ");
		radio=scanner.nextDouble();
		
		return radio;
	}
	
	public static double circunferencia(double r) { // Calcula la circunferencia y la devuelve
		double resultado=2*Math.PI*r;
		
		return resultado;
	}
	
	public static double area(double r) { // Calcula el área y la devuelve
		double resultado= Math.PI*Math.pow(r, 2);
		
		return resultado;
	}
	
	public static double volumen(double r) { // Calcula el volumen y lo devuelve
		double resultado= (4*Math.PI*Math.pow(r, 3))/3;
		
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion=0;
		double radio=0;
		
		do {
			opcion=menu(opcion);
			
			//Mientras no sea 5 pide radio
			if(opcion!=5) {
				radio=pideRadio(radio);
				
				switch(opcion) {
					case 1->{
						System.out.println("La circunferencia es: "+circunferencia(radio));
					}
					case 2->{
						System.out.println("El area es: "+area(radio));
					}
					case 3->{
						System.out.println("El volumen es: "+volumen(radio));
					}
					case 4->{
						System.out.println("La circunferencia es: "+circunferencia(radio));
						System.out.println("El area es: "+area(radio));
						System.out.println("El volumen es: "+volumen(radio));
					}
					default->{
						System.out.println("Datos erroneos");
					}
				}
			}else {
				System.out.println("Saliendo del programa...");
			}
			
			
		}while(opcion!=5);

	}

}
