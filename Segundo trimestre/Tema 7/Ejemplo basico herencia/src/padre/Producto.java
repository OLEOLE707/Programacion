/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/02/2026
* Contenido: Prueba de herencias conn la clase padre Producto
*/

package padre;

import java.time.LocalDate;

public class Producto {
	
	//----------
	//Atributos
	//----------
	public static final int MAX_COD_PRODUCTO=9999;
	
	protected static int contadorCod = -1;
	protected int codProducto;
	protected String nombre;
	protected LocalDate fechaCad; 
	protected int numLote;

	
	
	//--------------
	//Constructores
	//--------------
	public Producto(String nombre, LocalDate fechaCad, int numLote) throws IllegalArgumentException{
		if(nombre==null||nombre.isEmpty()) {
			throw new IllegalArgumentException("Error, el nombre : "+nombre+" no es válido");
		}
		
		if(numLote<0) {
			throw new IllegalArgumentException("Error en el numero de lote : "+numLote+" no es válido");
		}
		
		
		if(codProducto>MAX_COD_PRODUCTO) {
			throw new IllegalArgumentException("Cantida máxima de productos alcanzada");
		}
		
		
		contadorCod++;
		this.codProducto = contadorCod;
		
		
		this.nombre=nombre;
		this.fechaCad=fechaCad;
		this.numLote=numLote;
		
	}
	
	//---------------------
	//Guetters y setters
	//---------------------
	public int getcodProducto() { //Devuelve el CodProducto
		return this.codProducto;
	}
	
	public String getNombre() { //Devuelve el nombre
		return this.nombre;
	}
	
	public LocalDate getFechaCad() { //Devuelve la fecha de caducidad
		return this.fechaCad;
	}
	
	public int getNumLote() { //Devuelve el numero de lote
		return this.numLote;
	}
	
	
	
	public void setNombre(String nombreNuevo) { //Establece un nuevo nombre
		if(nombreNuevo==null||nombreNuevo.isEmpty()) {
			throw new IllegalArgumentException("Error, el nombre : "+nombreNuevo+" no es válido");
		}
		this.nombre=nombreNuevo;
	}
	
	public void setFechaCad(LocalDate nuevaFecha) { //Estblece la fecha de caducidad
		this.fechaCad=nuevaFecha;
	}
	
	public void setNumLote(int nuevoNumLote) { //Establece un nuevo num de lote 
		if(nuevoNumLote<0) {
			throw new IllegalArgumentException("Error en el numero de lote : "+numLote+" no es válido");
		}
		this.numLote=nuevoNumLote;
	}
	
	
	//----------
	//Metodos
	//---------
	public String toString() { //Devuelve el objeto y sus caracteristicas en texto
		String resultado = String.format("%" + 4 + "s", codProducto).replace(' ', '0');

		return "Producto {\n\tCódigo:"+resultado+"\n\tNombre:"+nombre+"\n\tFecha de Caducidad:"+fechaCad.toString()+"\n\tNumero de lote: "+numLote+"\n}";
	}
	
	public boolean estaCaducado() {
		if(fechaCad.isBefore(LocalDate.now())) {
			return true;
		}else {
			return false;
		}
	}
	
	public void diasHastaCaducidad() {
		if(estaCaducado()==true) {
			System.out.println("Producto ya caducado");
		}else {
			System.out.printf("Quedan: %d hasta que el producto caduque\n",LocalDate.now().until(fechaCad).getDays());
		}
	}
	
}
