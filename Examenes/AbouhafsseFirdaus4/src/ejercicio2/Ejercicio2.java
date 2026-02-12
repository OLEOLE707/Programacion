/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 17/11/2025
* Contenido: Programa que maneja un array multidimensional
*/

package ejercicio2;


public class Ejercicio2 {
	
	public static void diaSemana (int dato) {//Devuelve el dia de la semana en nombre
			
		switch(dato) {
			case 0->{ System.out.print("Lunes ");}
			case 1->{ System.out.print("Martes ");}
			case 2->{ System.out.print("Miercoles ");}
			case 3->{ System.out.print("Jueves ");}
			case 4->{ System.out.print("Viernes ");}
			case 5->{ System.out.print("Sabado ");}
			case 6->{ System.out.print("Domingo ");}
		}
	}
	
	public static int[] consumoMinDia(int[][] consumo) { //Devuelve la hora con el consumo mínimo
		int[] horaMinima= new int[7];
		int min, horaMin=0;
		
		
		for(int i=0; i<7; i++) {
			min=100;
			
					
			for(int j=0; j<=23; j++) {
				
				if(min>=consumo[i][j]) {
					min=consumo[i][j];
					horaMin=j;
				}
				
			}
			
			horaMinima[i]=horaMin;
		}
		return horaMinima;
	}
	
	
	public static int[] diaHoraMinimo(int[][] consumo){ //Devuelve el dia y la hora con el consumo minimo de la semana
		
		int minimo=100;
		
		int[] diaHora = new int[2];
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<24; j++) {
				
				if(minimo>consumo[i][j]) {
					minimo=consumo[i][j];
					
					diaHora[0]=i;
					diaHora[1]=j;
				}
				
			}
		}
		
		return diaHora;
	}
	
	public static int diaMasConsumo(int[][] consumo){ //Devuelve el dia con mas consumo
		int diaMasConsumo=0;
		int sumaConsumo=0, masConsumo=0;
		
		for(int i=0; i<7; i++) {
			sumaConsumo=0;
			
			for(int j=0; j<24; j++) {
				sumaConsumo+=consumo[i][j];
				
			}
			
			if(sumaConsumo>masConsumo) {
				
				masConsumo=sumaConsumo;
				diaMasConsumo=i;
			}
			
		}
		
		return diaMasConsumo;
	}
	
	public static int[] horaMayor20(int[][] consumo) { //Devuelve la hora con un consumo mayor a 20
		int[] horas= new int[7];
		int max=20;
		
		for(int i=0; i<7; i++) {	
			max=20;
			for(int j=0; j<=23; j++) {
				
				if(consumo[i][j]>max) {
					horas[i]=j;
					max=100;
				}	
			}
		}
		return horas;
	}
	

	public static void main(String[] args) {
		int[][] consumo= {{21,26,40,32,32,15,27,15,31,3,20,32,2,18,27,2,40,31,24,37,15,24,10,36},
				{5,25,28,5,10,30,14,6,35,33,29,9,32,15,8,37,15,39,19,30,40,14,18,2},
				{39,7,17,14,2,12,34,21,3,40,29,31,1,18,14,9,31,1,6,37,11,5,37,30},
				{1,12,37,6,7,30,31,3,15,35,2,38,6,30,32,31,2,32,6,14,14,21,21,38},
				{8,23,37,16,0,28,5,13,35,10,22,18,28,6,12,21,12,38,26,15,39,24,37,4},
				{28,7,27,5,21,27,37,17,39,8,29,30,22,10,6,32,39,18,34,0,25,35,4,29},
				{2,16,16,36,33,9,34,23,4,26,14,26,10,11,12,31,27,17,20,12,24,32,11,33}};
		
		
		int[] horas= new int[23];
		
		System.out.println("HORA CONSUMO MÍNIMO PARA CADA DÍA");
		System.out.println("----------------------------");
		
		for(int i=0; i<7; i++) {
			
			diaSemana(i);
			
			System.out.println(": "+consumoMinDia(consumo)[i]);
		}
		
		System.out.println("\nDIA Y HORA DE CONSUMO MINIMO EN LA SEMANA");
		System.out.println("-------------------------------------------");
		
		diaSemana(diaHoraMinimo(consumo)[0]);
		System.out.println("a las : "+diaHoraMinimo(consumo)[1]+" horas");
		
		
		System.out.println("\nDIA CON MAS CONSUMO DE LA SEMANA");
		System.out.println("----------------------------------");
		
		diaSemana(diaMasConsumo(consumo));
		
		System.out.println("\n\nPRIMERA HORA CON CONSUMO SUPERIOR A 20");
		System.out.println("--------------------------------------------");
		
		for(int i=0; i<7; i++) {
			
			diaSemana(i);
			
			System.out.println(": "+horaMayor20(consumo)[i]);
		}
		
	}

}
