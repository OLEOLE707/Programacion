/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:29/10/2025
 * Descripción: Programa que gestione matriculas de un gimnasio con un menú
 */


package ejercicio2;

import java.util.Scanner;

import ejercicio1.Ejercicio1.Operaciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Llamamos al escáner
		Scanner scanner =new Scanner(System.in);
		
		//Variables
		int opcion, iva1,iva2,iva3, descuento, opcion2, nMatriculas1,nMatriculas2,nMatriculas3;
		double pvp1, pvp2,pvp3 ,precioOferta, total;
		
		//Mostramos el título
		System.out.println("EJERCICIO 1: GESTIÓN DE UN GIMNASIO");
		System.out.println("-----------------------------------");
		System.out.println("TIPOS DE MATRICULAS: 1. FITNESS - 2. YOGA - 3. MUSCULACIÓN");
		System.out.println("Precio de la matrícula tipo 1 (FITNESS): 10.0€\nPrecio de la matrícula tipo 2 (YOGA): 15.0€\nPrecio de la matrícula tipo 3 (MUSCULACIÓN): 20.0€");
		
		//Menú
		System.out.println("\nMENU DE OPERACIONES");
		System.out.println("---------------------");
		System.out.println("1. Calcular PVP de cada matricula.\n2. Aplicar oferta a un tipo de matricula (sin iva).\n3. Calcular el importe total de matriculas realizadas (sin iva).\n4. Salir");
		System.out.print("Seleccione una opción: ");
		opcion=scanner.nextInt();
		
		
		//El bucle que nos hara repetir la opcion hasta que sleccionemos una correcta
		while (opcion>4 || opcion<1) {
			System.out.println("Opción no válida. Intente de nuevo.");
			
			System.out.println("\nMENU DE OPERACIONES");
			System.out.println("---------------------");
			System.out.println("1. Calcular PVP de cada matricula.\n2. Aplicar oferta a un tipo de matricula (sin iva).\n3. Calcular el importe total de matriculas realizadas (sin iva).\n4. Salir");
			System.out.print("Seleccione una opción: ");
			opcion=scanner.nextInt();
		}
		
		//Que se repita mientras no sea un numero determinado en este caso 5
		while(opcion!=5) {
			
			//Un switch para cada opcion
			switch(opcion) {
				case 1->{
					//Pedimos datos
					System.out.print("Ingrese el IVA para el tipo de matrícula 1 (4 - 10 - 21): ");
					iva1=scanner.nextInt();
					
					System.out.print("Ingrese el IVA para el tipo de matrícula 3 (4 - 10 - 21): ");
					iva2=scanner.nextInt();
					
					System.out.print("Ingrese el IVA para el tipo de matrícula 3 (4 - 10 - 21): ");
					iva3=scanner.nextInt();
					
					
					//Calculamos el pvp para cada matricula
					pvp1=10.0+(10.0*iva1/100);
					pvp2=15.0+(15.0*iva2/100);
					pvp3=20.0+(20.0*iva3/100);
					
					//Mostramos
					System.out.println("El PVP de la actividad de Fitness es: "+pvp1);
					System.out.println("El PVP de la actividad de Yoga es: "+pvp2);
					System.out.println("El PVP de la actividad de Musculación es: "+pvp3);	
					
				}
				case 2->{
					System.out.println("Seleccione el tipo de mátricula (1. Fitness, 2. Yoga o 3. Musculación)");
					System.out.print("->");
					opcion2=scanner.nextInt();
					
					System.out.print("Ingrese el % de descuento a aplicar: ");
					descuento=scanner.nextInt();
					
					if(opcion2==1) {
						precioOferta=10.0-(10.0*descuento/100);
						System.out.println("El precio final (sin iva) con descuento para el tipo de matrícula 1 es: "+precioOferta);
						
					}else if(opcion2==2) {
						precioOferta=15.0-(15.0*descuento/100);
						System.out.println("El precio final (sin iva) con descuento para el tipo de matrícula 2 es: "+precioOferta);
					}else if(opcion2==3) {
						precioOferta=20.0-(20*descuento/100);
						System.out.println("El precio final (sin iva) con descuento para el tipo de matrícula 3 es: "+precioOferta);
					}else {
						System.out.print("No válido");
					}
				}
				case 3->{
					System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 1: ");
					nMatriculas1=scanner.nextInt();
					
					System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 2: ");
					nMatriculas2=scanner.nextInt();
					
					System.out.print("Ingrese las matrículas realizadas para el tipo de matrícula 3: ");
					nMatriculas3=scanner.nextInt();
					

					total= (nMatriculas1*10)+(nMatriculas2*15)+(nMatriculas3*20);
					
					System.out.println("El importe total (sin iva) de las matrículas realizadas es: "+total);
					
					
				}
				case 4->{
					System.out.println("Saliendo del programa...");
					opcion=5;
				}
				default->{
					System.out.println("ERROR");
				}
			}
			
			//Menú
			System.out.println("\nMENU DE OPERACIONES");
			System.out.println("---------------------");
			System.out.println("1. Calcular PVP de cada matricula.\n2. Aplicar oferta a un tipo de matricula (sin iva).\n3. Calcular el importe total de matriculas realizadas (sin iva).\n4. Salir");
			System.out.print("Seleccione una opción: ");
			opcion=scanner.nextInt();
		}
	}
}
		
		

