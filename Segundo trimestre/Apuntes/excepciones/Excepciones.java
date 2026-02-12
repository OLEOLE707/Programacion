package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int entero;
		boolean error=false;
		
		do {
			System.out.print("Dame un entero: ");
			try {
			//	scanner.close();
				entero=scanner.nextInt();
				error=false;
				
			}catch(InputMismatchException ex1){
				
				System.out.println("No es un entero");
				error=true;
				entero=0;
				
				scanner.nextLine();
				
				
			}
			
		}while (error==true);
		
		System.out.println("El entero es: "+entero);
	}

}
