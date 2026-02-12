package clase_Bombo;

public class Bombo {

	// Atributo de clase constante
	public final static byte MAX_BOLAS = 90;
	public final static byte MIN_BOLAS = 9;
	public final static byte DEFAULT_CAPACIDAD = Bombo.MAX_BOLAS;

	// Atributo de objeto
	private final int[] registroBolas;

	private int numBolasExtraidas;
	private int capacidad;

	// ---------------
	// Constructores
	// ---------------

	// Un parámetro
	public Bombo(int capacidad) throws IllegalArgumentException {
		if (capacidad < Bombo.MIN_BOLAS || capacidad > Bombo.MAX_BOLAS) {
			throw new IllegalArgumentException("Capacidad de bombo no válida: " + capacidad);
		} else {
			registroBolas = new int[capacidad];
			llenar();
		}
		
		this.capacidad=capacidad;
	}

	// Sin parámetros
	public Bombo() {
		this(Bombo.DEFAULT_CAPACIDAD);
	}

	// ---------
	// Guetters
	// ---------
	public int getCapacidad() {
		return this.registroBolas.length;
	}

	public int getCantidadBolasExtraidas() {
		return this.numBolasExtraidas;
	}

	public int getCantidadBolasRestantes() {
		return this.getCapacidad() - this.numBolasExtraidas;
	}

	public boolean isVacio() {
		return this.numBolasExtraidas == this.capacidad;
	}

	public boolean isCompleto() {
		return this.numBolasExtraidas == 0;
	}

	// -----------
	// Metodos
	// ----------

	private void llenar() { // Llena el Bombo
		for (int i = 0; i < this.getCapacidad(); i++) {
			registroBolas[i] = i + 1;
		}
	}

	public String toString() { // Devuelve el objeto formateado
		return String.format("Capacidad: %d bolas. Cantidad de bolas extraídas: %d", this.getCapacidad(),
				this.numBolasExtraidas);
	}

	public int extraerBola() throws IllegalStateException { // Saca una bola
		if (this.isVacio()) {
			throw new IllegalStateException("bombo vacío");
		} else {
			int aleatoria = this.numBolasExtraidas+(int) (Math.random() * (this.getCapacidad() - this.numBolasExtraidas));
			int bola = registroBolas[aleatoria];

			registroBolas[aleatoria] = registroBolas[this.numBolasExtraidas];
			registroBolas[this.numBolasExtraidas] = bola;
			this.numBolasExtraidas++;

			return bola;
		}
	}
	
	
	public int reset () { //Resetea el bombo
		  int bolasFuera= this.numBolasExtraidas;
		  this.numBolasExtraidas = 0;
		  llenar ();
		  return bolasFuera;
		}
	
	
	
	
	
	
	
	
	
}
