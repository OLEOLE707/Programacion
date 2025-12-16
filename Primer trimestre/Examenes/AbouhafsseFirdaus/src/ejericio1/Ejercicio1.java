/*
 * Nombre: Firdaus Abouhafsse Mehamed
 * Fecha: 12/11/2025
 * Contenido: 
 */


package ejericio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Importamos el escaner
		Scanner scanner=new Scanner(System.in);
		
		//Variables
		
		//Para guardar la cantidad de numeros en cada decena y el valor entero introducido
		int numeroIntroducido,num0=0,num1=0, num2=0, num3=0, num4=0, num5=0, num6=0, num7=0, num8=0, num9=0, num10=0, decimas;
		
		//Para guardar las medias de cada decenas
		double media0=0,media1=0, media2=0, media3=0, media4=0, media5=0, media6=0, media7=0, media8=0, media9=0, media10=0;
		
		//Que siga pidiendo mientras el número no sea 0
		do {
			System.out.print("Introduce un número del 1-100: ");
			numeroIntroducido=scanner.nextInt();
			
			while(numeroIntroducido<0 || numeroIntroducido>100) {
				System.out.print("Introduce un número del 1-100: ");
				numeroIntroducido=scanner.nextInt();
			}
			
			//Sacamos las unidades para que queden las decenas
			decimas=numeroIntroducido/10;
			
			//Switch co los casos posibls
			switch(decimas) {
				case 0->{
					//Para que no nos cuente el 0 de salida
					if(numeroIntroducido!=0) {
						num0++;
						media0+=numeroIntroducido;
					}
				}
				case 1->{
					num1++;
					media1+=numeroIntroducido;
				 }
				case 2->{
					num2++;
					media2+=numeroIntroducido;
				 }
				case 3->{
					num3++;
					media3+=numeroIntroducido;
				 }
				case 4->{
					num4++;
					media4+=numeroIntroducido;
				 }
				case 5->{
					num5++;
					media5+=numeroIntroducido;
				 }
				case 6->{
					num6++;
					media6+=numeroIntroducido;
				 }
				case 7->{
					num7++;
					media7+=numeroIntroducido;
				 }
				case 8->{
					num8++;
					media8+=numeroIntroducido;
				 }
				case 9->{
					num9++;
					media9+=numeroIntroducido;
				 }
				case 10->{
					num10++;
					media10+=numeroIntroducido;
				 }
				default->{
					break;
				}
			}
					
		}while (numeroIntroducido!=0); 
		
		//Mostramos los resultados para cada décima
		System.out.println("\nPara la décima 0 (1-9): ");
		System.out.println("Cantidad de números: "+num0);
		System.out.println("Media: "+media0/num0);
		
		System.out.println("\nPara la décima 1 (10-19): ");
		System.out.println("Cantidad de números: "+num1);
		System.out.println("Media: "+media1/num1);
		
		System.out.println("\nPara la décima 2 (20-29): ");
		System.out.println("Cantidad de números: "+num2);
		System.out.println("Media: "+media2/num2);
		
		System.out.println("\nPara la décima 3 (30-39): ");
		System.out.println("Cantidad de números: "+num3);
		System.out.println("Media: "+media3/num3);
		
		System.out.println("\nPara la décima 4 (40-49): ");
		System.out.println("Cantidad de números: "+num4);
		System.out.println("Media: "+media4/num4);
		
		System.out.println("\nPara la décima 5 (50-59): ");
		System.out.println("Cantidad de números: "+num5);
		System.out.println("Media: "+media5/num5);
		
		System.out.println("\nPara la décima 6 (60-69): ");
		System.out.println("Cantidad de números: "+num6);
		System.out.println("Media: "+media6/num6);
		
		System.out.println("\nPara la décima 7 (70-79): ");
		System.out.println("Cantidad de números: "+num7);
		System.out.println("Media: "+media7/num7);
		
		System.out.println("\nPara la décima 8 (80-89): ");
		System.out.println("Cantidad de números: "+num8);
		System.out.println("Media: "+media8/num8);
		
		System.out.println("\nPara la décima 9 (90-99): ");
		System.out.println("Cantidad de números: "+num9);
		System.out.println("Media: "+media9/num9);
		
		System.out.println("\nPara la décima 10 (100): ");
		System.out.println("Cantidad de números: "+num10);
		System.out.println("Media: "+media10/num10);


	}

}
