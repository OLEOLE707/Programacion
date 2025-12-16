/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 02/12/2025
* Contenido: Cumplir con los diferentes apartados del ejercicio usando la libreria cuenta bancaria
*
*/
package ejercicio1;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {
	
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
        
    //Apartado 1
    	CuentaBancaria cuentaPrivada, cuentaConjunta, cuentaFamiliar;
    	
    	
    //Apartado 2
    	//1. Cuenta con fecha inválida
    	try {
    		CuentaBancaria fechaInvalida = new CuentaBancaria(10, LocalDate.of(2027,9,1));
    	}catch(IllegalArgumentException ex1) {
    		System.out.println("Fecha no válida");
    	}
    	
    	//2. Cuenta con saldo inválido
    	try {
    		CuentaBancaria fechaInvalida = new CuentaBancaria(-200.00);
    	}catch(IllegalArgumentException ex1) {
    		System.out.println("Saldo no válido");
    	}
    	
    	 //3. Constructor de tres parámetros
    	 cuentaPrivada = new CuentaBancaria(1000, LocalDate.of(2021, 7, 1), -200);
    	 
    	 //4. Constructor de dos parámetros
    	 cuentaConjunta = new CuentaBancaria(200, LocalDate.of(2021, 7, 1));
    	 
    	 //5. Constructor sin parámetros
    	 cuentaFamiliar = new CuentaBancaria();
    	 
    //Apartado 3 
    	 System.out.println("\nInformacion de la cuenta privada");
    	 System.out.println("--------------------------------");
    	 infoCuenta(cuentaPrivada);
    	
    	 
    //Apartado 4
    	 //1.
    	 cuentaPrivada.ingresar(100);
    	 
    	 //2.
    	 cuentaConjunta.extraer(100);
    	 
    	 //3.
    	 cuentaPrivada.transferir(1100, cuentaFamiliar);
    	 
    //Apartado 5
    	 System.out.println("\nInformacion de las cuentas despues de los cambios");
    	 System.out.println("---------------------------------------------------");
    	 //1.
    	 System.out.println("Cuenta privada: "+cuentaPrivada.toString());
    	 
    	//2.
    	 System.out.println("Cuenta conjunta: "+cuentaConjunta.toString());
    	 
    	//3.
    	 System.out.println("Cuenta familiar: "+cuentaFamiliar.toString());
    	 
    	 
    }
}
