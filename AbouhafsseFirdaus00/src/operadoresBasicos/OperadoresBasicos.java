package operadoresBasicos;

import java.util.Scanner;

public class OperadoresBasicos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int dato1;
		double dato2;
		
		System.out.print("Introduce tu primer dato: " );
		dato1=scanner.nextInt();
		
		System.out.print("Introduce tu segundo dato: " );
		dato2=scanner.nextDouble();
		
		
		int suma= (int) (dato1+dato2), resta=(int)(dato1-dato2), multiplicacion=(int) (dato1*dato2), modulo=(int) (dato1%dato2);
		
		double division=dato1/dato2;
		
		System.out.println("\nOperaciones básicas");
		
		System.out.println("--------------------");
		
		System.out.println("Dato 1: "+dato1+"\nDato 2: "+dato2+"\n");
		
		System.out.println("Suma: "+suma+"\nResta: "+resta+"\nMultiplicación: "+multiplicacion+"\nDivisión: "+division+"\nMódulo: "+modulo);

	}

}
