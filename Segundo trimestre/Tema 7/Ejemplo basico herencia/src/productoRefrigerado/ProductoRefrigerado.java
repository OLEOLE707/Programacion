/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/02/2026
* Contenido: Prueba de herencias conn la clase hija ProductoRefriogerado
*/

package productoRefrigerado;

import java.time.LocalDate;

import padre.Producto;


public class ProductoRefrigerado extends Producto{


	//-----------
	//Atributos
	//-----------
	protected int codOrgSupAl;
	protected byte temperaturaMinConserv;
	protected LocalDate fechaConsumoPreferente;
	
	
	//--------------
	//Constructores
	//--------------
	public ProductoRefrigerado(String nombre, LocalDate fechaCad, int numLote,LocalDate fechaConsumoPreferente, byte temperaturaMinConserv, int codOrgSupAl){
		super(nombre, fechaCad, numLote);
		
		
		this.fechaConsumoPreferente=fechaConsumoPreferente;
		this.temperaturaMinConserv=temperaturaMinConserv;
		this.codOrgSupAl=codOrgSupAl;
		
	}
	
	
	//---------------------
	//Guetters y setters
	//--------------------
	public byte getTemperaturaMinConserv() {
		return this.temperaturaMinConserv;
	}
	
	public int getCodOrgSupAl() {
		return this.codOrgSupAl;
	}
	
	public LocalDate getFechaConsumoPreferente() {
		return this.fechaConsumoPreferente;
	}
	
    
	public void setFechaConsumoPreferente(LocalDate nuevaFecha) {
		this.fechaConsumoPreferente=nuevaFecha;
	}
	
	public void setTemperaturaMinConserv(byte nuevaTemp) {
		this.temperaturaMinConserv=nuevaTemp;
	}
	
	public void setCodOrgSupAl(int nuevoCod) {
		this.codOrgSupAl=nuevoCod;
	}
	
	
	//-----------
	//Métodos
	//----------
	public String toString() {
		String resultado = String.format("%" + 4 + "s", codProducto).replace(' ', '0');

		return "ProductoRefrigerado {\n\tCódigo:"+resultado+"\n\tNombre:"+nombre+"\n\tFecha de Caducidad:"+fechaCad.toString()+"\n\t"
				+ "Numero de lote: "+numLote+"\n\tFecha de consumo preferente: "+fechaConsumoPreferente+"\n\t"
						+ "Temperatura mínima de conserva: "+temperaturaMinConserv+"\n\tCodigo del organismo de supervisión alimentaria:"+codOrgSupAl+"\n}";
	}

}
