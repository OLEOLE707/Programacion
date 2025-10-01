package condicionalIf;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int edad;
		
		System.out.print("Introduce tu edad: ");
		edad=scanner.nextInt();
		
		if(edad>=18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}

	}

}
