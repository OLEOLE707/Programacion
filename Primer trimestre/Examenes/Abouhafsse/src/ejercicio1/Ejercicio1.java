/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:29/10/2025
 * Descripción: Convertir expresiones matemáticas en expresiones algorítmicas
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	//Creamos nuestro enumerado con las opciones necesarias
	public enum Operaciones {OPERACION,FUERZA_PESO,NUMERO_VUELTAS,AREA_CIRCULO}
	
	public static void main(String[] args) {
		//Llamamos al escáner
		Scanner scanner =new Scanner(System.in);
		
		//Creamos las variables necesarias
		
		//Para guardar cada una de las operaciones
		Operaciones var1=Operaciones.OPERACION;
		Operaciones var2=Operaciones.FUERZA_PESO;
		Operaciones var3=Operaciones.NUMERO_VUELTAS;
		Operaciones var4=Operaciones.AREA_CIRCULO;	
		
		//Enteras
		int x, masa, tiempo,  numeroVueltas;
		
		//Reales
		double radio, frecuencia, operacion, fuerzaPeso, areaCirculo;
		
		//Constantes
		final double GRAVEDAD=9.8;
		
		
		//Titulo del ejercicio
		System.out.println("CÁLCULO EXPRESIONES FÍSICAS/MATEMÁTICAS");	
		System.out.println("---------------------------------------");
		
		
		//Pedimos los valores de las variables		
		System.out.print("Introduce el valor de X: ");	
		x=scanner.nextInt();
		
		System.out.print("Introduce la masa (kg): ");	
		masa=scanner.nextInt();
		
		System.out.print("Introduce el tiempo (s): ");	
		tiempo=scanner.nextInt();
		
		System.out.print("Introduce la frecuencia (hz): ");	
		frecuencia=scanner.nextDouble();
		
		System.out.print("Introduce el radio del circulo (m): ");	
		radio=scanner.nextDouble();
		
		
		//Montamos los calculos
		
		//Aqui pasamos de entero a double con un casting explicito
		operacion=((x+(x/4.0)))/(6-(x/2.0)); 
		
		//Aqui pasamos de entero a double con un casting implicito
		fuerzaPeso=masa*GRAVEDAD; 
		
		//Aqui pasamos de real a entero con un casting explícito
		numeroVueltas= (int) (frecuencia * tiempo);
				
		//Este se mantiene como real ya que sus datos son reales
		areaCirculo=Math.PI*(Math.pow(radio, 2)); 
		
		
		//Mostramos
		System.out.println("\nRESULTADOS");	
		System.out.println("----------");
		
		System.out.println(var1+": "+operacion);
		System.out.println(var2+": "+fuerzaPeso);
		System.out.println(var3+": "+numeroVueltas);
		System.out.println(var4+": "+areaCirculo);

	}

}
