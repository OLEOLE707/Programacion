/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 02/12/2025
* Contenido: Cumplir con los diferentes apartados del ejercicio usando la libreria dado
*
*/
package ejercicio2;

import libtarea3.Dado;

public class Ejercicio2 {

	public static void main(String[] args) {
	
	//Apartado 1
		
		System.out.println("\n\nConsulta inicial de valores globales de la clase");
		System.out.println("--------------------------------");
		
		//1. Numero de dados creados hasta ahora
		System.out.printf("Numero de dados creados: %s ",Dado.getNumeroDadosCreados());		
		
		//2. Numero total de lanzamientos hasta ahora
		System.out.printf("\nNumero de lanzamientos: %s ",Dado.getNumeroLanzamientosGlobal());		
				
		//3. Cantidad de veces que han salido las caras
		System.out.print("\nNumero de veces por cada cara:");
		System.out.printf("\n-Cara 1: %s",Dado.getNumeroVecesCaraGlobal(1));
		System.out.printf("\n-Cara 2: %s",Dado.getNumeroVecesCaraGlobal(2));
		System.out.printf("\n-Cara 3: %s",Dado.getNumeroVecesCaraGlobal(3));
		System.out.printf("\n-Cara 4: %s",Dado.getNumeroVecesCaraGlobal(4));
		
		System.out.println();
		
	//Apartado 2
		System.out.println("\n\nCreación y lanzamiento de dados");
		System.out.println("--------------------------------");
		//1. Bucle de creación de datos
		for(int i=0; i<10; i++) {
			int caras=((int)(Math.random()*8));
			int suma=0;
			
			try {
				Dado dado = new Dado(caras);
				
				System.out.println("\nIntento "+(i+1)+": Intentando crear un dado aleatorio de "+caras+" caras. Correcto. Número de caras válido: "+caras);
				
				
				//2. Bucle para tirar los dados
				for(int j=0 ;j<caras; j++) {
					dado.lanzar();
				}
				
				
				
				System.out.printf("\nLanzamientos de dado con %s caras: \n",caras);
				for(int j=1; j<=caras; j++) {
					System.out.printf("-Cara "+j+" : %s",dado.getNumeroVecesCara(j)+"\n");
				}
				
				System.out.println();
				
				
				//3.Resultados obtenidos con ese dado
				System.out.println("Serie histórica de lanzamiento del dado: "+dado.getSerieHistoricaLanzamientos());
				System.out.printf("Suma de los lanzamientos: %s \n\n",dado.getSumaPuntuacionHistorica());
				
			}catch(IllegalArgumentException ex1) {
				System.out.println("Intento "+(i+1)+": Intentando crear un dado aleatorio de "+caras+" caras. Error. Número de caras no válido: "+caras);
			}
			
		}
		
		
	//Apartado 3
		
		System.out.println("\n\nConsulta final de valores globales de la clase");
		System.out.println("--------------------------------");
		
		//1. Numero de dados creados hasta ahora
		System.out.printf("Numero de dados creados: %s ",Dado.getNumeroDadosCreados());		
		
		//2. Numero total de lanzamientos hasta ahora
		System.out.printf("\nNumero de lanzamientos: %s ",Dado.getNumeroLanzamientosGlobal());		
				
		//3. Cantidad de veces que han salido las caras
		System.out.print("\nNumero de veces por cada cara:");
		System.out.printf("\n-Cara 1: %s",Dado.getNumeroVecesCaraGlobal(1));
		System.out.printf("\n-Cara 2: %s",Dado.getNumeroVecesCaraGlobal(2));
		System.out.printf("\n-Cara 3: %s",Dado.getNumeroVecesCaraGlobal(3));
		System.out.printf("\n-Cara 4: %s",Dado.getNumeroVecesCaraGlobal(4));
		
		System.out.println();
		

	}

}
