/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 28/01/2026
* Contenido: Manipulacion de la clase cuenta bancaria
*/

package ej2;

import java.time.LocalDate;
import java.util.Random;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	// 1. Método que genera un límite aleatorio entre -4000 y 0 (sin decimales)
	public static double limiteAleatorio() {
		Random r = new Random();
		return (r.nextInt(401) - 400) * 10;
	}

	public static void main(String[] args) {

		CuentaBancaria firdaus_1 = null;
		CuentaBancaria firdaus_2 = null;
		CuentaBancaria firdaus_3 = null;

		// 3. Instanciación con control de errores
		boolean creada = false;

		while (!creada) {
			try {
				firdaus_1 = new CuentaBancaria(1000,LocalDate.now() ,limiteAleatorio());
				creada = true;
			} catch (Exception e) {
				System.out.println(e.getMessage()+" Error al crear Firdaus_1. Reintentando...");
			}
		}

		creada = false;
		while (!creada) {
			try {
				firdaus_2 = new CuentaBancaria(1000,LocalDate.now() ,limiteAleatorio());
				creada = true;
			} catch (Exception e) {
				System.out.println(e.getMessage()+" Error al crear Firdaus_2. Reintentando...");
			}
		}

		creada = false;
		while (!creada) {
			try {
				firdaus_3 = new CuentaBancaria(1000,LocalDate.now() ,limiteAleatorio());
				creada = true;
			} catch (Exception e) {
				System.out.println(e.getMessage()+" Error al crear Firdaus_3. Reintentando...");
			}
		}

		// Mostrar información de cada cuenta
		System.out.println("---------------------------");
		System.out.println("Información de las cuentas ");
		System.out.println("----------------------------");
		System.out.println(firdaus_1.toString()); 
		System.out.println(firdaus_2.toString()); 
		System.out.println(firdaus_3.toString()); 

		// 4. Cuenta con menor límite de descubierto
		CuentaBancaria menorLimite = firdaus_1;

		if (firdaus_2.getLimiteDescubierto() < menorLimite.getLimiteDescubierto()) {
			menorLimite = firdaus_2;
		}
		if (firdaus_3.getLimiteDescubierto() < menorLimite.getLimiteDescubierto()) {
			menorLimite = firdaus_3;
		}

		System.out.println("\nCuenta con menor límite de descubierto:");
		System.out.println(menorLimite.toString()); 

		// 9. Realizar 5 transferencias de 300€
		System.out.println("-------------------");
		System.out.println("\nTransferencias ");
		System.out.println("-------------------");
		
		for (int i = 1; i <= 5; i++) {
			firdaus_1.transferir(300,firdaus_2);
		}

		System.out.println("Saldo TuNombre_1: " + firdaus_1.getSaldo());
		System.out.println("Saldo TuNombre_2: " + firdaus_2.getSaldo());

		// 10. Embargar el 50% 
		System.out.println("------------");
		System.out.println("\nEmbargo ");
		System.out.println("------------");
		firdaus_3.embargar(50);
		System.out.println(firdaus_3.toString()); 

		// 11. Saldo global y cuentas embargadas
		double saldoGlobal = firdaus_1.getSaldo() +firdaus_2.getSaldo() + firdaus_3.getSaldo();

		int cuentasEmbargadas = 0;
		if (firdaus_1.isEmbargada())
			cuentasEmbargadas++;
		if (firdaus_2.isEmbargada())
			cuentasEmbargadas++;
		if (firdaus_3.isEmbargada())
			cuentasEmbargadas++;

		System.out.println("\nSaldo global de todas las cuentas: " + saldoGlobal);
		System.out.println("Número de cuentas embargadas: " + cuentasEmbargadas);
	}
}
