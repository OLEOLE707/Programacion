/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Crea una clase Punto con dos atributos
*
*/
package ejA1;

public class Punto {
	
	//Apartado A
	private int x;
	private int y;
	
	//Apartado B
	public Punto(int x, int y){ 
		this.x = x;
		this.y = y;
		
		
	}
	
	//Apartado C
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
}

