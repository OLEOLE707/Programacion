package clase_Dado;

import java.time.LocalDate;

public class Dado {

	// Variable de clase constante

	private static final String[] NOMBRES_CARAS = { "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO",
			"NUEVE", "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISÉIS", "DICECISIETE", "DIECIOCHO",
			"DIECINUEVE", "VEINTE" };

	public static final byte NumCaras_DEFAULT = 6;

	// Variable de objeto
	private int[] registroLanzamientos;
	private byte NumCaras;
	private long numLanzamientos;

	
	
	// Constructor con un parámetro
	public Dado(byte NumCaras) throws IllegalArgumentException {
		if (NumCaras != 4 && NumCaras != 6 && NumCaras != 8 && NumCaras != 12 && NumCaras != 20) {
			throw new IllegalArgumentException(String.format("numero de caras no válido: %d", NumCaras));
		}
		this.registroLanzamientos = new int[NumCaras];
	}

	
	
	// Constructor sin parámetros
	public Dado() {
		this(Dado.NumCaras_DEFAULT);
	}

	// GUETTERS
	public byte getNumeroCaras() {
		return (byte) this.registroLanzamientos.length;
	}

	public long getNumeroLanzamientos() {
		long totalLanzamientos = 0;
		for (int i = 0; i < this.registroLanzamientos.length; i++) {
			totalLanzamientos += this.registroLanzamientos[i];
		}
		return totalLanzamientos;
	}

	// Metodos
	public String Lanzar() { // Decuelve el nombre de la cara que ha salido al tirar el dado
		byte aleatorio = (byte) (Math.random() * this.NumCaras);
		this.registroLanzamientos[aleatorio]++;
		return Dado.NOMBRES_CARAS[aleatorio];
	}

	public String toString() { // Devuelve el objeto en String
		return String.format("Número de caras: %d, Número de lanzamientos: %d", this.NumCaras, this.numLanzamientos);
	}

	public int getNumeroVecesCara(byte cara) throws IllegalArgumentException { // Devuelve cuantas veces ha caido esa cara
		if (cara < 1 || cara > this.getNumeroCaras()) {
			throw new IllegalArgumentException("numero de cara no válida");
		}
		return this.registroLanzamientos[cara - 1];
	}
}
