/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 29/01/2026
* Contenido: Crear la clase cafetera
*/


package ej2;

public class Cafetera {
	//---------
	//Atributos
	//-------------
	
	public final static int CAPACIDAD_DEFAULT=1000;
	public final static int CANTIDAD_DEFAULT=0;
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	
	//----------------
	//CONSTRUCTORES
	//----------------
	
	//Cantidad maxima y actual
	public Cafetera(int capacidadMaxima,int cantidadActual) throws IllegalArgumentException {
		if(capacidadMaxima<=0) {
			throw new IllegalArgumentException("La capacidad máxima no puede ser <=0");
		}
		
		this.capacidadMaxima=capacidadMaxima;
		
		if (cantidadActual < 0) {
            throw new IllegalArgumentException("La cantidad actual no puede ser negativa");
        }

        if (cantidadActual > capacidadMaxima) {
        	
            int sobrante = cantidadActual - capacidadMaxima;
            
            this.cantidadActual = capacidadMaxima;
            
            throw new IllegalArgumentException("Cantidad actual mayor que la capacidad máxima. Sobrante: " + sobrante + " cc");
        }

        this.cantidadActual = cantidadActual;
    }
	
	
	
	//Capacidad maxima
	public Cafetera(int capacidadMaxima) throws IllegalArgumentException{
		if(capacidadMaxima<=0) {
			throw new IllegalArgumentException("La capacidad máxima no puede ser <=0");
		}
		
		this.capacidadMaxima=capacidadMaxima;
		this.cantidadActual=capacidadMaxima;
	}
	
	
	//Sin parámetros
	public Cafetera() {
		this(CAPACIDAD_DEFAULT,CANTIDAD_DEFAULT);
	}
	
	
	
	
	//------------------
	//SETTERS Y GETTERS
	//-----------------
	
	//Setters
	public void setCantidadActual(int cantidad){
		
		if(cantidad>capacidadMaxima) {
			
			this.cantidadActual=capacidadMaxima;
			
			throw new IllegalArgumentException("Cantidad  actual mayor a capacidad máxima, cantidad sobrante: "+(cantidad-capacidadMaxima));
			
        } else if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad actual no debe ser menor que cero");
        }    
			this.cantidadActual=cantidad;
        
	}
	
	
	public void setCapacidadMaxima(int capacidadMaxima) {
		if(capacidadMaxima<=0) {
			throw new IllegalArgumentException("La capacidad máxima no puede ser <=0");
		}
		
		this.capacidadMaxima=capacidadMaxima;
	}
	
	
	
	//Getters
	public int getCantidadActual() {
		return this.cantidadActual;
	}
	
	
	public int getCapacidadMaxima() {
		return this.capacidadMaxima;
	}
	
	
	
	//----------------
	//METODOS
	//----------------
	
	
	public void llenarCafetera(double cantidad) throws IllegalArgumentException{ //Añade la cantidad dada a la cafetera
		if (cantidad<0) { 
			throw new IllegalArgumentException("La cantidad no puede ser negativa");
		}
		
		if((cantidad+cantidadActual)>capacidadMaxima) {
			throw new IllegalArgumentException("La cantidad supera la capacidad máxima: "+capacidadMaxima);
		}
		
		this.cantidadActual+=cantidad;
	}
	
	public void servirTaza(int cantidad) throws IllegalStateException{ //Sirve una taza
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a servir debe ser mayor que 0");
        }
		
		if(cantidad>cantidadActual) {			
			setCantidadActual(0);
			
			throw new IllegalStateException("Café insuficiente, cantidadActual: "+cantidadActual);
			
		}
		
		this.cantidadActual-=cantidad;
		
	}
	
	
	
	public void vaciarCafetera() { //Vacia la cafetera
		this.cantidadActual=0;
	}
	
	
	//toString
	public String toString() { // Devuelve el objeto formateado
		return String.format("Capacidad maxima: %d cc. Cantidad actual: %d", this.getCapacidadMaxima(),
				this.getCantidadActual());
	}
	
	
	
}
	