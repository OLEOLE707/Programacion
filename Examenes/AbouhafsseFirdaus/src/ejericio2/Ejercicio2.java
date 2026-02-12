/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 12/11/2025
 * Contenido: 
 */


package ejericio2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Importamos el escáner
		Scanner scanner=new Scanner(System.in);
		
		//Variables
		
		//El array con 30 huecos
		int[] array= new int[30];
		
		int num, longitud=0, contador=0, posicion1, posicion2, impares=0;
		
		//Pedimos el número
		System.out.print("Introduce el número deseado (0-300): ");
		num=scanner.nextInt();
		
		//Si el numero no es correcto volvemos a pedir
		while(num<0||num>300) {
			System.out.print("Introduce el número deseado (0-300): ");
			num=scanner.nextInt();
		}
		
		
		//Llenamos el array
		for(int i=0 ;i<30; i++) {
			array[i]=(int)(1+Math.random()*301);
			
			//Damos los saltos de linea para cuando ya hallan 10 en una fila 
			if(i==10 ||i==20) {
				System.out.print("\n");
				System.out.print(array[i]+"\t");
			}else {
				System.out.print(array[i]+"\t");
			}
			
			//Si el array en esa posicion es igual al numero sumamos la variable
			if(array[i]==num) {
				longitud++;	
				
			}
		
		}
		
		System.out.print("\n");
		
		
		//Si longitud es mayor que 0 significa que si hay
		if(longitud>0) {
			
			//Creamos un array con longitud de la cantidad que haya
			int[] puestos=new int[longitud];
			
			
			//Llenamos ese array con los huecos
			for(int i=0; i<array.length; i++) {
				if(array[i]==num) {
					puestos[contador]=i;
					contador++;
				}
			}
		
			System.out.println("\nPosiciones: "+Arrays.toString(puestos));
			
		//Si no hay no se muestra	
		}else {
			System.out.println("\nEse numero no se encuentra");
				
		}
		
		
		//Pedimos esas dos posiciones
		System.out.print("\nIntrosduuce la posicion 1: ");
		posicion1=scanner.nextInt();
		
		System.out.print("Introsduce la posicion 2: ");
		posicion2=scanner.nextInt();
		
		
		//Por si la posicion 2 es mayor que la 1
		while(posicion2<posicion1) {
			System.out.println("\nLa posicion 2 no pude ser mayor que la posicion 1");
			
			System.out.print("\nIntrosduuce la posicion 1: ");
			posicion1=scanner.nextInt();
			
			System.out.print("Introsduce la posicion 2: ");
			posicion2=scanner.nextInt();
		}
		
		//Si hay impares se aumenta la variable
		for(int i=posicion1; i<=posicion2; i++) {
			
			if(array[i]%2!=0) {
				impares++;
			}
			 
		}
		
		
		//si la variable no es cero calculamos
		if(impares>0) {
			int[] impar=new int[impares];
			contador=0;
			
			for(int i=posicion1; i<=posicion2; i++) {
				if(array[i]%2!=0) {
					
					impar[contador]=array[i];
					contador++;
				}
			}
		
			System.out.println("\nImpares entre la posicion "+posicion1+" y la posicion "+posicion2+": "+Arrays.toString(impar));
			
			
		}else {
			System.out.println("\nNo hay numeros impares");
				
		}
		
		

	}
}
	

