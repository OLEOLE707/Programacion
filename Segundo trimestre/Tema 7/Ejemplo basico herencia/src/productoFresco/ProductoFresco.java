/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/02/2026
* Contenido: Prueba de herencias conn la clase hija ProductoFresco
*/

package productoFresco;

import java.time.LocalDate;

import padre.Producto;

public class ProductoFresco extends Producto{
	
	//-----------
	//Atributos
	//-----------
	protected LocalDate fechaEnvasado;
	protected String paisOrigen;
	
	
	//--------------
	//Constructores
	//--------------
	public ProductoFresco(String nombre, LocalDate fechaCad, int numLote,LocalDate fechaEnvasado,String paisOrigen) throws IllegalArgumentException{
		super(nombre, fechaCad, numLote);
		
		if(fechaEnvasado.isAfter(fechaCad)) {
			throw new IllegalArgumentException("La fecha de envasado no puede ser después que la de caducidad");
		}
		
		this.fechaEnvasado=fechaEnvasado;
		this.paisOrigen=paisOrigen;
	}
	
	
	//---------------------
	//Guetters y setters
	//--------------------
	public LocalDate getFechaEnvasado() {
		return this.fechaEnvasado;
	}
	
	public String getPaisOrigen() {
		return this.paisOrigen;
	}
	
    
	public void setFechaEnvasado(LocalDate nuevaFecha) {
		if(nuevaFecha.isAfter(fechaCad)) {
			throw new IllegalArgumentException("La fecha de envasado no puede ser después que la de caducidad");
		}
		this.fechaEnvasado=nuevaFecha;
	}
	
	public void setPaisOrigen(String nuevoOrigen) {
		this.paisOrigen=nuevoOrigen;
	}
	
	
	//-----------
	//Métodos
	//----------
	public String toString() {
		String resultado = String.format("%" + 4 + "s", codProducto).replace(' ', '0');

		String descripcion="ProductoFresco:{\n\tCódigo:"+resultado+"\n\tNombre:"+nombre+"\n\tFecha de Caducidad:"+fechaCad.toString()+
				"\n\tNumero de lote: "+numLote+"\n\tFecha de envasado: "+fechaEnvasado+"\n\tPais de origen: "+paisOrigen+"\n}";
		
		return descripcion;

	}

}
