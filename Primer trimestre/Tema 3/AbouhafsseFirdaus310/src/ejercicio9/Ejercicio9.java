/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 24/10/2025
 * Contenido: Crea un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10, pedir un valor N y mostrar en qué posiciones del array aparece N.
 */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int n, largoPos=0,pos=0;
		int[] array= new int[100], posiciones=new int[100];
		
		
		System.out.print("Introduce el valor : ");
		n=scanner.nextInt();
	
		
		//Para guardarlo y mostrarlo
		for(int i=0;i<100;i++) {
			
			array[i]=(int)((Math.random()*10)+1);
			
			if(array[i]==n) {
				
				//Guardamos la i en las posiciones del array
				posiciones[pos]=i;
				
				//Aumentamos el numero
				pos++;
				
			}
		}
		
		
		System.out.print("\nEl numero "+n+" aparece en estas posiciones del array: ");
		
        if (pos == 0) {
            System.out.println(n+" no aparece en ninguna posición.");
        } else {
            for (int i = 0; i < pos; i++) {
				if(i==0) {
					System.out.print("("+posiciones[i]+", ");
				}else if(i==(pos-1)){
					System.out.print(posiciones[i]+")");
				}else {
					System.out.print(posiciones[i]+", ");
				}		
            }
        }
	}
}
