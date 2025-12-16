/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/12/2025
* Contenido: Usando la clase bombo, que se incluye en la librería, construir un programa que use sus metodos, constructores, etc..
*
*/

package ejercicio2;

import libtarea3.Bombo;

public class Ejercicio2 {
	
	public static Bombo crearValidar(int capacidad) { //Creara el bombo y lo validara mostrando, si hay, el mensaje de error
		boolean error=false;
		Bombo dato;
		
		try {
			error=false;
			dato = new Bombo(capacidad);				
		}catch(IllegalArgumentException ex1) {
			System.out.println("Error. "+ex1.getMessage());
			error=true;
			dato = new Bombo();
		}
		
		if(error==false) {
			System.out.printf("Correcto. Creado bombo de %s elementos.\n",dato.getCapacidad());
			System.out.println("Estado inicial: "+dato.toString());
		}
		
		return dato;
	}
	

	public static void main(String[] args) {
		
		System.out.println("USO DE BOMBOS");
		System.out.println("-------------");

		
	//1. Intentos de creación y llenado de bombos:
		System.out.println("\n-----------------------------------");
		System.out.println("CREACIÓN DE BOMBOS (CONSTRUCTORES)");
		System.out.println("-----------------------------------");
		
		//1.1 Capacidades no válidas
	
		System.out.println("Intentando crear un bombo con capacidad inferior a la permitida...");
		crearValidar(Bombo.MINIMA_CAPACIDAD-1);
	
		System.out.println("\nIntentando crear un bombo con capacidad superior a la permitida...");
		crearValidar(Bombo.MAXIMA_CAPACIDAD+1);
				
		//1.2 Capacidades válidas
		
		//Omision
		System.out.println("\nCreando bombo por omisión...");
		Bombo omision= new Bombo();
		System.out.println("Correcto. Creado bombo de 90 elementos");
		System.out.println("Estado inicial: "+omision.toString());
		
		//15 Elementos
		System.out.println("\nCreando bombo de 15 elementos...");
		Bombo e15 = crearValidar(15);
		
		//Mostramos datos
		System.out.printf("Bolas extraidas: %s\n",e15.getBolasExtraidas());
		
		System.out.printf("Cantidad de bolas extraidas: %d\n",e15.getCantidadBolasExtraidas());
		
		System.out.printf("Bolas restantes: %s\n",e15.getBolasRestantes());
		
		System.out.printf("Cantidad de bolas restantes: %d\n",e15.getCantidadBolasRestantes());
		
	//2. Pruebas de extracción
		System.out.println("\n------------------------");
		System.out.println("PRUEBAS DE EXTRACCIÓN");
		System.out.println("------------------------");
		
		//2.1
		System.out.println("PRUEBA 1: EXTRACCIÓN DE TODAS LAS BOLAS DE UN BOMBO:");
		System.out.println("----------------------------------------------------");

		System.out.println("Extrayendo todas las bolas del bombo...");
		
		for(int i=0; i<e15.getCapacidad(); i++) {
			System.out.printf("Extraída la bola: %d\n",e15.extraerBola());
		}
		
		//Mostramos datos
		System.out.println("Estado del bombo tras sacar todas las bolas: "+e15.toString());

		System.out.printf("Bolas extraidas: %s\n",e15.getBolasExtraidas());
		
		System.out.printf("Cantidad de bolas extraidas: %d\n",e15.getCantidadBolasExtraidas());
		
		System.out.printf("Bolas restantes: %s\n",e15.getBolasRestantes());
		
		System.out.printf("Cantidad de bolas restantes: %d\n",e15.getCantidadBolasRestantes());
		
		//2.2
		System.out.println("\nPRUEBA 2: REINICIO DEL BOMBO:");
		System.out.println("------------------------------");
		
		System.out.println("Rellenamos el bombo con la misma capacidad...");
		e15.reset();
		System.out.printf("Se han añadido %d bolas\n",e15.getCapacidad());

		System.out.println("Estado del bombo tras reiniciar: "+e15.toString());
		
		
		//2.3
		System.out.println("\nPRUEBA 3: EXTRACCIÓN DE NÚMERO ALEATORIO DE BOLAS DE UN BOMBO:");
		System.out.println("-----------------------------------------------------------------");

		System.out.println("Extrayendo un numero aleatorio de bolas...");
		
		int nExtraer = (int) (1+Math.random()*15); 
		
		System.out.printf("Vamos a extraer %d bolas.\n",nExtraer);
		
		for(int i=0; i<nExtraer; i++) {
			System.out.printf("Extraída la bola: %d\n",e15.extraerBola());
		}
		
		//Mostramos datos
		System.out.println("Estado del bombo tras sacar todas las bolas: "+e15.toString());

		System.out.printf("Bolas extraidas: %s\n",e15.getBolasExtraidas());
		
		System.out.printf("Cantidad de bolas extraidas: %d\n",e15.getCantidadBolasExtraidas());
		
		System.out.printf("Bolas restantes: %s\n",e15.getBolasRestantes());
		
		System.out.printf("Cantidad de bolas restantes: %d\n",e15.getCantidadBolasRestantes());
		

	}

}
