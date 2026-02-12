/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 29/01/2026
* Contenido: Crear la clase linea
*/

package ej1;

import java.util.Locale;

import ejA1.Punto;

public class Linea {

	// Atributos
	private Punto puntoA, puntoB;

	// Constructores
	Linea() {
		this.puntoA = new Punto(0, 0);
		this.puntoB = new Punto(0, 0);
	}

	Linea(Punto puntoA, Punto puntoB) throws IllegalArgumentException {

		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	
	//Setters y Guetters
	
	
	
	

	// Metodos
	public void mueveDerecha(double d) { // Desplaza la línea a la derecha la distancia que se indique
		puntoA.setX(this.puntoA.getX() + d);
		puntoB.setX(this.puntoB.getX() + d);
	}

	public void mueveIzquierda(double d) { // Desplaza la línea a la izquierda la distancia que se indique
		puntoA.setX(this.puntoA.getX() - d);
		puntoB.setX(this.puntoB.getX() - d);
	}

	public void mueveArriba(double d) { // Desplaza la línea arriba la distancia que se indique
		puntoA.setY(this.puntoA.getY() + d);
		puntoB.setY(this.puntoB.getY() + d);
	}

	public void mueveAbajo(double d) { // Desplaza la línea abajo la distancia que se indique
		puntoA.setY(this.puntoA.getY() - d);
		puntoB.setY(this.puntoB.getY() - d);
	}

	public String escribirLinea() { // Método que nos permita mostrar la información de la línea

		String cadena = String.format(Locale.US, "[(%.1f,%.1f),(%.1f,%.1f)]", puntoA.getX(), puntoA.getY(),
				puntoB.getX(), puntoB.getY());

		return cadena;
	}
}
