/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Crea una clase Rectangulo
*
*/

package ejA3;

public class Rectangulo {
	
	//Apartado A
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	//Apartado B
	public Rectangulo(int x1, int y1, int x2, int y2) throws IllegalArgumentException{
		validar(x1, y1, x2, y2);
	    this.x1 = x1;
	    this.y1 = y1;
		this.x2 = x2;
    	this.y2 = y2;
	}
		
	
	//Apartado C
	
	//Guetters
	public int getX1() {
		return x1;
	}
	
	public int getX2() {
		return x2;
	
	}
	
	public int getY1() {
		return y1;

	}
	
	public int getY2() {
		return y2;

	}	
	
	
	//Setters
	public void setX1(int x1) throws IllegalArgumentException {
		if(x2<x1) {
			throw new IllegalArgumentException("ERROR: x2 debe ser mayor que x1");
		}else {
			this.x1=x1;
		}
	}
	
	public void setX2(int x2) throws IllegalArgumentException {
		if(x2<x1) {
			throw new IllegalArgumentException("ERROR: x2 debe ser mayor que x1");
		}else {
			this.x2=x2;
		}
		
	}
	
	public void setY1(int y1) throws IllegalArgumentException {
		if(y2<y1) {
			throw new IllegalArgumentException("ERROR: y2 debe ser mayor que y1");
		}else {
			this.y1=y1;
		}
	}
	
	public void setY2(int y2) throws IllegalArgumentException{
		if(y2<y1) {
			throw new IllegalArgumentException("ERROR: y2 debe ser mayor que y1");
		}else {
			this.y2=y2;
		}
	}
	
	
	
	//Apartado D
	public void imprimir() {//Imprime los datos del rectangulo
		System.out.println("Rectángulo: (" + x1 + "," + y1 + ") - (" + x2 + "," + y2 + ")");
	}
	
	
	public void setX1Y1(int x1, int y1){ //Stter doble de x1 e y1
		if(x2<x1) {
			throw new IllegalArgumentException("ERROR: x2 debe ser mayor que x1");
		}
		
		if(y2<y1) {
			throw new IllegalArgumentException("ERROR: y2 debe ser mayor que y1");
		}
		
		this.x1=x1;
		this.y1=y1;
	}
	
	public void setX2Y2(int x2, int y2){ //Setter doble de x2 e y2
		if(x2<x1) {
			throw new IllegalArgumentException("ERROR: x2 debe ser mayor que x1");
		}
		
		if(y2<y1) {
			throw new IllegalArgumentException("ERROR: y2 debe ser mayor que y1");
		}
		
		this.x2=x2;
		this.y2=y2;
	}
	
	public void setAll(int x1, int y1, int x2, int y2) { //Setter cuadruple
	    validar(x1, y1, x2, y2);
	    this.x1 = x1;
	    this.y1 = y1;
	    this.x2 = x2;
	    this.y2 = y2;
	}

	
	public int getPerimetro() { //Devuelve el perimetro
		return 2*((x2-x1)+(y2-y1));
	}
	
	public int getArea() { //Devuelve el area
		return  (x2-x1)*(y2-y1) ;
	}
	

	
	
	private void validar(int x1, int y1, int x2, int y2) { //Valida los puntos
	    if (x2 < x1) {
	        throw new IllegalArgumentException("ERROR: x2 debe ser mayor que x1");
	    }
	    if (y2 < y1) {
	        throw new IllegalArgumentException("ERROR: y2 debe ser mayor que y1");
	    }
	}
}
