/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Crea una clase Punto con dos atributos
*
*/
package ejA1;

public class Punto {
	
	//Apartado A
	private double x;
	private double y;
	
	//Apartado B
	public Punto(double x, double y){ 
		this.x = x;
		this.y = y;
		
	}
	
	//Apartado C
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public void setY(double y) {
		this.y=y;
	}
	
	
	//Apartado D
	
	public void imprime() { //Imprime las coordenadas del punto
		System.out.println("("+this.x+", "+this.y+")");
	}
	
	public void setXY(double x, double y){ //Actua como un doble setter
		this.x=x;
		this.y=y;
	}
	
	public void desplaza(double dx, double dy) { //Suma numeros enteros a las coordenadas para desplazarlas
		this.x=x+dx;
		this.y=y+dy;	
	}
	
	public int distancia(Punto p) { //Calcula la distancia entre dos puntos
		int distancia=(int) Math.sqrt(Math.pow((p.x-this.x), 2)+Math.pow((p.y-this.y), 2));
		
		return distancia;
	}
	
}

