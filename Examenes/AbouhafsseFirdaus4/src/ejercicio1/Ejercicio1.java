/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 17/11/2025
* Contenido: Programas manejando cuentas bancarias
*/


package ejercicio1;

import java.util.Random;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {
	
	
	//APARTADO 1
	public static int saldoAleatorio() {//Devuelve un saldo aleatorio
		Random rand = new Random();
		
		int signo =(rand.nextInt(-1, 2));
		
		if(signo==0) {
			signo=1;
		}
		
		int saldo=((rand.nextInt(3) + 1)*1000);
		
		if(saldo<3000 && saldo>0) {
			
			saldo+=(rand.nextInt(3) + 1)*100;
		
		}else if( saldo>-3000 && saldo<0) {
			
			saldo-=(rand.nextInt(3) + 1)*100;
		}
		
		return signo*saldo;
	}
	
	public static void infoCuenta(CuentaBancaria cuenta) { //Muestra información sobre una cuenta
		
		//Identificador
		System.out.printf("Identificador: %d",cuenta.getId());
		
		//Fecha de creación
		System.out.printf("\nFecha de cración: "+cuenta.getFechaCreacion());
		
		//Límite de descubierto con 2 decimales
		System.out.printf("\nLímite de descubierto: %.2f",cuenta.getLimiteDescubierto());

		//Si esta embargada o no
		if(cuenta.isEmbargada()==true) {
			System.out.println("\nLa cuenta está embargada");
		}else {
			System.out.println("\nLa cuenta no está embargada");
		}
		
		
		//Si esta en descubierto o no
		if(cuenta.isDescubierta()==true) {
			System.	out.println("La cuenta está en decubierto");
		}else {
			System.	out.println("La cuenta no esta en descubierto");
		}
		
		
		//El número de días que lleva abierta
		System.out.printf("Dias abierta: %s",cuenta.getDiasCuenta()+"\n");
		
	}
	
	
	public static void main(String[] args) {
		
		
		//APARTADO 2
		CuentaBancaria abouhafsse_1, abouhafsse_2, abouhafsse_3;
		
		
		//APARTADO 3
		System.out.println("CREANDO CUENTA 1:");
		try {
			abouhafsse_1= new CuentaBancaria(saldoAleatorio());
		}catch(IllegalArgumentException ex1) {
			System.out.println("ERROR: Creando cuenta con valores predeterminados");
			abouhafsse_1= new CuentaBancaria();
		}
		System.out.println("Cuenta creada");

		
		System.out.println("CREANDO CUENTA 2:");
		try {
			abouhafsse_2= new CuentaBancaria(saldoAleatorio());
		}catch(IllegalArgumentException ex1) {
			System.out.println("ERROR: Creando cuenta con valores predeterminados");
			abouhafsse_2= new CuentaBancaria();
		}
		System.out.println("Cuenta creada");

		
		
		System.out.println("CREANDO CUENTA 3:");
		try {
			abouhafsse_3= new CuentaBancaria(saldoAleatorio());
		}catch(IllegalArgumentException ex1) {
			System.out.println("ERROR: Creando cuenta con valores predeterminados");
			abouhafsse_3= new CuentaBancaria();
		}
		System.out.println("Cuenta creada");

		
		System.out.println("Cuenta 1:");
		System.out.println(abouhafsse_1.toString());
		
		System.out.println("Cuenta 2:");
		System.out.println(abouhafsse_2.toString());
		
		System.out.println("Cuenta 3:");
		System.out.println(abouhafsse_3.toString());
		
		//APARTADO 4
		String mayorSaldo="abouhafsse_1";
		double mayorSaldoNum=abouhafsse_1.getSaldo();
		
		if(abouhafsse_2.getSaldo() > mayorSaldoNum) {
			mayorSaldo="abouhafsse_2";
			mayorSaldoNum=abouhafsse_2.getSaldo();
		}
		
		if(abouhafsse_3.getSaldo() > mayorSaldoNum) {
			mayorSaldo="abouhafsse_3";
			mayorSaldoNum=abouhafsse_3.getSaldo();
		}
		
		System.out.println("El mayor saldo de las tres cuentas lo tiene la cuenta "+mayorSaldo+" con "+mayorSaldoNum);
		
		//APARTADO 5
		System.out.println("\nINGRESAMOS 1000€ EN ABOUHAFSSE_1");
		abouhafsse_1.ingresar(1000);
		System.out.println("Cuenta 1:");
		System.out.println(abouhafsse_1.toString());

	}

}

