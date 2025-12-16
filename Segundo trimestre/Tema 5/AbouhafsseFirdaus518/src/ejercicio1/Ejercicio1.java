/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 10/12/2025
* Contenido: Usando la clase bombilla, que se incluye en la librería, construir un programa que use sus metodos, constructores, etc..
*
*/

package ejercicio1;

import java.time.format.DateTimeFormatter;

import libtarea3.Bombilla;
import libtarea3.Utilidades;
import java.time.LocalDateTime;

public class Ejercicio1 {
	
	public static void encender(Bombilla dato) {
		
		try {
			dato.encender();
		}catch(IllegalStateException ex2) {
			System.out.println("Error: "+ex2.getMessage());
		}
		
	}
	
	
	public static void apagar(Bombilla dato) {
			
			try {
				dato.apagar();
			}catch(IllegalStateException ex2) {
				System.out.println("Error: "+ex2.getMessage());
			}
			
		}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("TRABAJO CON BOMBILLAS");
		System.out.println("----------------------");
		
	//1. Declaramos tres variables referencia
		Bombilla encendida100V;
		Bombilla encendida;
		Bombilla omision;

	//2. Llevamos a cabo una consulta inicial de valores de la clase bombilla
		System.out.println("\n\n1.-CONSULTA INICIAL DE VALORES GLOBALES");
		System.out.println("-----------------------------------------");
		
		//2.1
		System.out.printf("Numero bombillas creadas: %d\n", Bombilla.getBombillasCreadas());
		
		//2.2
		System.out.printf("Numero bombillas encendidas: %d\n", Bombilla.getBombillasEncendidas());
		
		
	//3. Instanciamos tres objetos
		System.out.println("\n\n2.-CREACIÓN Y USO DE BOMBILLAS");
		System.out.println("--------------------------------");
		
		System.out.println("\nCreación de bombillas(Constructores)");
		System.out.println("--------------------------------------");
		
		//3.1 Intentar crear una bombilla con estado inicial "encendida" y con una potencia no válida 
		System.out.println("\nIntentar crear una bombilla con estado inicial \"encendida\" y con una potencia no válida de 250W");
		try {	
			Bombilla noValida= new Bombilla(true, 250);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println("Error en la creación: "+ex1.getMessage());
		}
		
		//3.2 Intentar instanciar otra bombilla sin estado inicial y una potencia no válida
		System.out.println("\nIntentar crear una bombilla con estado inicial \"encendida\" y con una potencia no válida de 5W");
		try {	
			Bombilla potenciaNoValida= new Bombilla(5);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println("Error en la creación: "+ex1.getMessage());
		}

		
		//3.3
		System.out.println("\nCreando una bombilla encendida con una potencia válida con un constructor de dos parámetros...");
		
		try {	
			encendida100V= new Bombilla(true, 100);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println("Error en la creación: "+ex1.getMessage());
			encendida100V= new Bombilla();
			
		}
		
		System.out.println("Bombilla 1 creada: "+encendida100V.toString());
		
		
		//3.4
		System.out.println("\nCreando una bombilla encendida con una potencia por defecto usando el constructor de un parámetro...");
		try {	
			encendida= new Bombilla(true);
			
		}catch(IllegalArgumentException ex1) {
			System.out.println("Error en la creación: "+ex1.getMessage());
			encendida= new Bombilla();
		}
		System.out.println("Bombilla 2 creada: "+encendida.toString());
		
		
		//3.5
		System.out.println("\nCreando una bombilla con valores por defecto usando el constructor sin parametros...");	
			
		omision= new Bombilla();
			
		System.out.println("Bombilla 3 creada: "+omision.toString());

		
	
	//4.Operaciones sobre las bombillas
		System.out.println("\nManipulación de bombillas(Métodos)");
		System.out.println("------------------------------------");
		
		//4.1 Encender la primera bombilla
		System.out.println("Intentando encender la primera bombilla...");
		encender(encendida100V);
		
		//4.2 Conmutar 6 veces la primera bombilla y esperar un segundo
		for(int i=0; i<6; i++) {
			System.out.println("\nConmutando estado de la Bombilla 1.");
			encendida100V.conmutar();
			System.out.println("Estado de Bombilla 1: "+encendida100V.toString());
			Utilidades.esperar(1);
		}
		
		//4.3 Apagar la segunda bombilla
		System.out.println("Apagando la Bombilla 2...");
		apagar(encendida);
		
		//4.4 Encender la tercera bombilla
		System.out.println("Encendiendo la Bombilla 3...");
		encender(omision);
		
	//5. Mostrar informacion de la primera bombilla por pantalla
		System.out.println("\nBombilla 1");
		System.out.println("-----------");
		
		//5.1 Potencia
		System.out.printf("Potencia: %.2f\n",encendida100V.getPotencia());
		
		//5.2 Estado
		if(encendida100V.getEstado()) {
			System.out.println("Estado: Encendida");
		}else {
			System.out.println("Estado: Apagada");
		}
		
		//5.3 Ultima vez que se encendio
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				
		System.out.printf("Ultima vez que se encendio: %s\n",encendida100V.getUltimaVezEncendida().format(formato).toString());
		
		//5.4 Numero de veces encendida
		System.out.printf("Nº veces encendida: %d\n", encendida100V.getVecesEncendida());
		
		//5.5 Tiempo que lleva encendida
		System.out.printf("Tiempo que lleva encendida: %.2f segundos\n",encendida100V.getTiempoEncendida());
		
		//5.6 Tiempo que lleva encendida
		System.out.printf("Potencia consumida: %.2fW\n",encendida100V.getPotenciaConsumida());
		
		
	//6. Consulta final d valores de la clase bombilla
		System.out.println("\n\n3.-CONSULTA FINAL DE VALORES GLOBALES");
		System.out.println("-----------------------------------------");
		
		//6.1
		System.out.printf("Numero bombillas creadas: %d\n", Bombilla.getBombillasCreadas());
		
		//6.2
		System.out.printf("Numero bombillas encendidas: %d\n", Bombilla.getBombillasEncendidas());
	}
}
