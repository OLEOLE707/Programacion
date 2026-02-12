/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Crea una clase Rectangulo
*
*/

package ejA3;

public class Rectangulo {
	
	//Apartado A
	int x1;
	int x2;
	int y1;
	int y2;
	
	//Apartado B
	public Rectangulo(int x1, int y1, int x2, int y2) throws IllegalArgumentException{
		
		if(x2<x1) {
			throw new IllegalArgumentException("ERROR: x2 debe ser mayor que x1");
		}
		
		if(y2<y1) {
			throw new IllegalArgumentException("ERROR: y2 debe ser mayor que y1");
		}
		
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;	
	}
	
	
	

}
