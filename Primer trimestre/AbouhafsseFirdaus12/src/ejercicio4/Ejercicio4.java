/*
 * Descripción: Imprimir diferentes tamaños por pantalla
 * Autor: Firdaus Abouhafsse
 * Fecha:23/09/2025
 */


package ejercicio4;

public class Ejercicio4 {
	
	public enum Tamano {PEQUENA,MEDIANA,GRANDE,EXTRAGRANDE}

	public static void main(String[] args) {
		
		Tamano var1=Tamano.PEQUENA;
		Tamano var2=Tamano.MEDIANA;
		Tamano var3=Tamano.GRANDE;
		Tamano var4=Tamano.EXTRAGRANDE;
		
		System.out.println("El valor de la variable uno es: "+var1+", este tamaño es el más pequeño");
		
		System.out.println("El valor de la variable dos es: "+var2+", este tamaño es el punto medio de las variables");
		
		System.out.println("El valor de la variable tres es: "+var3+", este tamaño es más grande que el pequeño pero no el más grande");
		
		System.out.println("El valor de la variable cuatro es: "+var4+", este tamaño es el más grande que hay.");
		
	
	}
	

}
