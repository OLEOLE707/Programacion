/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:21/10/2025
 * Descripción: Calcular cuántos minutos faltan para el fin de semana
 */

package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int horas, minutos, minutosTotales = 0, minViernes2130, minFinal,diasRestantes,horasRestantes,calculo;
		String dia;
		
		System.out.print("Introduce el dia: ");
		dia=scanner.nextLine();
		
		System.out.print("Introduce la hora: ");
		horas=scanner.nextInt();
		
		System.out.print("Introduce los minutos: ");
		minutos=scanner.nextInt();
		
        switch (dia) {
            case "lunes":{
            	minutosTotales = 0; 
            	break;
            }
            case "martes":{ 
            	minutosTotales = 1 * 24 * 60; 
            	break;
            }
            case "miercoles","miércoles":{ 
            	minutosTotales = 2 * 24 * 60;
            	break;}
            case "jueves":{ 
            	minutosTotales = 3 * 24 * 60;
            	break;
            }
            case "viernes": { 
            	minutosTotales = 4 * 24 * 60;
            	break;
            }
            default:
                System.out.println("Día no válido.");
        }
		
        
        minutosTotales=minutosTotales+(horas*60)+minutos;
        
        minViernes2130=(4*24*60)+((21*60)+30);
        
        //Resultado
        minFinal=minViernes2130-minutosTotales;
        
        
        //Para calcularlo en dias y horas tambien
        calculo=minFinal;
        
        diasRestantes=calculo/(24*60);
        calculo-=diasRestantes*(24*60);
        
        horasRestantes=calculo/60;
        calculo-=horasRestantes*60;
        		
        
		System.out.println("\nLos dias restantes son: "+diasRestantes+"\nLas horas restantes: "+horasRestantes+"\nLos minutos restantes: "+calculo);
		
		System.out.println("\nEn minutos es: "+minFinal);


	}

}
