package ejercicio4;

public class Ejercicio4 {
	
	public enum Tamano {pequena,mediana,grande,extragrande}

	public static void main(String[] args) {
		
		Tamano var1=Tamano.pequena;
		Tamano var2=Tamano.mediana;
		Tamano var3=Tamano.grande;
		Tamano var4=Tamano.extragrande;
		
		System.out.println("El valor de la variable uno es: "+var1+", este tamaño es el mas pequeño");
		
		System.out.println("El valor de la variable dos es: "+var3+", este tamaño es el punto medio de las tallas");
		
		System.out.println("El valor de la variable tres es: "+var3+", este tamaño es mas grnade quel pequeño pero no el mas grande");
		
		System.out.println("El valor de la variable cuatro es: "+var4+", este tamaño es el mas grande que hay.");
		
	
	}
	

}
