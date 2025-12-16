/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 18/11/2025
* Contenido: Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga si la fecha es correcta o no. 
*/


package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static boolean fechaCorrecta(int dia, int mes, int año) { //Comprueba si la fecha introducida es correcta
		
		boolean correcto=true;
		
		//Primero comprobamos si esta dentro de los máximos posibles
		if((mes>12 || mes<1)||(dia>31 || dia<1)||año<0) {
			correcto=false;
		
		}else {
			//Año bisiesto
			if((año%100)%4==0) {
				
				//Divido los meses por el maximo de sus dias
				switch(mes){
					case 1,3,5,7,8,10,12->{
						if(dia>31) correcto=false;
					}
					case 2->{
						if(dia>29) correcto=false;
					}
					case 4,6,9,11->{
						if(dia>30) correcto=false;
					}
					default->{
						correcto=true;
					}
				}
			
			//Año no bisiesto
			}else {
					switch(mes){
					case 1,3,5,7,8,10,12->{
						if(dia>31) correcto=false;
					}
					case 2->{
						if(dia>28) correcto=false;
					}
					case 4,6,9,11->{
						if(dia>30) correcto=false;
					}
					default->{
						correcto=true;
					}
				}	
			}
		}	
		return correcto;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dias, meses, años;
		
		System.out.print("Introduce el dia: ");
		dias=scanner.nextInt();
		
		System.out.print("Introduce el mes: ");
		meses=scanner.nextInt();
		
		System.out.print("Introduce el año: ");
		años=scanner.nextInt();
		
		
		if(fechaCorrecta(dias, meses, años)==true) {
			System.out.println("La fecha "+dias+"/"+meses+"/"+años+" es correcta");
		}else {
			System.out.println("La fecha "+dias+"/"+meses+"/"+años+" no es correcta");
		}
		
		
		

	}

}
