/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/02/2026
* Contenido: Prueba de herencias conn la clase hija ProductoCongelado
*/

package productoCongelado;

import java.time.LocalDate;

import padre.Producto;

public class ProductoCongelado extends Producto{
	//-----------
	//Atributos
	//-----------
	protected byte temperaturaCong;
	protected byte numMesesConserva;
	
	
	//--------------
	//Constructores
	//--------------
	public ProductoCongelado(String nombre, LocalDate fechaCad, int numLote, byte temperaturaCong, byte numMesesConserva){
		super(nombre, fechaCad, numLote);

		contadorCod++;
		
		this.temperaturaCong=temperaturaCong;
		this.numMesesConserva=numMesesConserva;
	}
	
	
	//---------------------
	//Guetters y setters
	//--------------------
	public byte getTemperaturaCong() {
		return this.temperaturaCong;
	}
	
	public byte getNumMesesConserva() {
		return this.numMesesConserva;
	}

	
    
	public void setNumMesesConserva(byte nuevosMeses) {
		this.numMesesConserva=nuevosMeses;
	}
	
	public void setTemperaturaCong(byte nuevaTemp) {
		this.temperaturaCong=nuevaTemp;
	}
	
	
	
	//-----------
	//Métodos
	//----------
	public String toString() {
		String resultado = String.format("%" + 4 + "s", codProducto).replace(' ', '0');

		return "ProductoCongelado {\n\tCódigo:"+resultado+"\n\tNombre:"+nombre+"\n\tFecha de Caducidad:"+fechaCad.toString()+"\n\t"
				+ "Numero de lote: "+numLote+"\n\tTemperatura de congelacion "+temperaturaCong+"\n\t"
						+ "Numero de meses que se puede tener en conserva"+numMesesConserva+"\n}";
	}

}
