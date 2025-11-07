/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:17/10/2025
 * Descripción: Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int dia,mes;
		String signo;
		
		System.out.print("Introduce el dia: ");
		dia=scanner.nextInt();
		
		System.out.print("Introduce el mes: ");
		mes=scanner.nextInt();
		
		while (mes>12 || mes<1) {
			System.out.println("Mes inválido");
			
			System.out.print("Introduce el mes: ");
			mes=scanner.nextInt();
		}
		
		
		switch(mes) {
			//Enero
			case 1->{
				
				if(dia>=1 && dia<20) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Capricornio");
					
				}else if(dia>=20 && dia<=31){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Acuario");
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Febrero
			case 2->{
				if(dia>=1 && dia<19) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Acuario");
					
				}else if(dia>=19 && dia<=28){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Piscis");
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Marzo
			case 3->{
				if(dia>=1 && dia<21) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Piscis");
					
				}else if(dia>=21 && dia<=31){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Aries");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Abril
			case 4->{
				if(dia>=1 && dia<20) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Aries");
					
				}else if(dia>=20 && dia<=30){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Tauro");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Mayo
			case 5->{
				if(dia>=1 && dia<21) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Tauro");
					
				}else if(dia>=21 && dia<=31){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Géminis");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Junio
			case 6->{
				if(dia>=1 && dia<21) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Géminis");
					
				}else if(dia>=21 && dia<=30){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Cáncer");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Julio
			case 7->{
				if(dia>=1 && dia<23) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Cáncer");
					
				}else if(dia>=23 && dia<=31){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Leo");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Agosto
			case 8->{
				if(dia>=1 && dia<23) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Leo");
					
				}else if(dia>=23 && dia<=31){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Virgo");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Septiembre
			case 9->{
				if(dia>=1 && dia<23) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Virgo");
					
				}else if(dia>=23 && dia<=30){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Libra");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Octubre
			case 10->{
				if(dia>=1 && dia<23) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Libra");
					
				}else if(dia>=23 && dia<=31){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Escorpio");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Noviembre
			case 11->{
				if(dia>=1 && dia<23) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Escorpio");
					
				}else if(dia>=23 && dia<=30){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Sagitario");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			//Diciembre
			case 12->{
				if(dia>=1 && dia<23) {
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Sagitario");
					
				}else if(dia>=23 && dia<=31){
					System.out.println("Si has nacido el "+dia+"/"+mes+" eres: Capricornio");
					
				}else {
					System.out.print("Día inválido");
				}
			}
			
			default->{
				System.out.print("Día no válido");
			}
		}
	}
}


