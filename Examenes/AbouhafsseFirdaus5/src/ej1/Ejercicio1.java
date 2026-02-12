/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 28/01/2026
* Contenido: Crear una tabla de productividad
*/


package ej1;

import java.util.Random;

public class Ejercicio1 {

	public static int creadorUnidades(){ //Crea las unidades para rellenar el array
		Random rand = new Random();
		
		return (rand.nextInt(10, 30))*10;
	}
	
	public static int[][] llenarTabla(int[][] tabla, int x, int y){
		//Llenamos la tabla
		for(int i=0;i<x; i++) {
			for (int j=0; j<y;j++) {
				tabla[i][j]=creadorUnidades();
			}
		}
		
		return tabla;
	}
	
	public static void mostrarTabla(String[] operarios, String[] dias, int[][] produccion) { //Va a mostrar la tabla entregada 
		//Mostramos los dias de la semana
		System.out.print("\t");
		for(int i=0; i<dias.length;i++) {
			System.out.print(dias[i]+" ");
		}
		
		
		//Mostramos los operarios y las unidades
		System.out.println();
		for(int i =0; i<operarios.length;i++) {
			System.out.print(operarios[i]);
			
			for(int j=0; j<produccion.length;j++) {
				System.out.print("\t"+produccion[i][j]+" ");
			}
			
			System.out.println();	
		}
	}
	
	public static int produccionSemanal(int operario, int[][] tabla) { //Va a devolver la produccion semanal del operario entregado
		int sumatorio=0;
		
		for(int j=0;j<tabla.length;j++) {
			sumatorio+=tabla[operario][j];
		}
		
		return sumatorio;
	}
	
	public static int produccionDia(int dia, int[][] tabla) { //Va a devolver la produccion semanal del operario entregado
		int sumatorio=0;
		
		for(int j=0;j<tabla.length;j++) {
			sumatorio+=tabla[j][dia];
		}
		
		return sumatorio;
	}
	
	
	
	
	public static void main(String[] args) {
		
		//Variables
		String[] operarios= {"Juan", "Jose","Pedro","Luis"};
		
		String[] dias= {"Lunes", "Martes","Miercoles","Jueves","Viernes"};
		
		int menorMedia=400, menorDia=0;
		
		int[][] produccion= new int[4][5];
		
		//Llenamos la tabla
		produccion=llenarTabla(produccion, 4,5);
		
		//Mostramos la tabla
		mostrarTabla(operarios, dias, produccion);
		
		
		//Apartado 1
		System.out.println("\nPRODUCCION SEMANAL DE CADA OPERARIO");
		System.out.println("-----------------------------------");
		
		for(int i=0; i<operarios.length; i++) {
			System.out.println(operarios[i]+"= "+produccionSemanal(i, produccion));
		}
		
		//Apartado 2
		System.out.println("\nMEDIA PRODUCCION AL DIA");
		System.out.println("-----------------------");
		
		for(int i=0; i<dias.length; i++) {
			System.out.println(dias[i]+"= "+produccionDia(i, produccion)/4);
		}
		
		//Apartado 3
		System.out.println("\nDIA CON MENOR MEDIA");
		System.out.println("-----------------------");
		
		for(int i=0; i<dias.length; i++) {
			
			if((produccionDia(i,produccion)/4) <menorMedia) {
			
				menorMedia=produccionDia(i,produccion)/4;
				menorDia=i;
			}
		}
		
		System.out.println("El dia con menor media fue: "+dias[menorDia]);
		
	}

}
