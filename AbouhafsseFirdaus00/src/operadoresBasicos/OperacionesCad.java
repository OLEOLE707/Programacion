package operadoresBasicos;

import java.util.Scanner;

public class OperacionesCad {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String variable;
		int longitud;
		
		System.out.print("Introduce una cadena: ");
		variable=scanner.nextLine();
		
		longitud= variable.length();
		
		System.out.println("Tu nombre tiene: "+longitud+" caracteres");
		
		String variableMinuscula;
		
		variableMinuscula= variable.toLowerCase();
		
		System.out.println("Tu nombre en minuscula es: "+variableMinuscula);

		
		System.out.println("Tu nombre en mayuscula es: "+variable.toUpperCase());
		
		

	}

}
