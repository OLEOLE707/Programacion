package funciones;

import java.util.Scanner;

public class Funciones {

	//Compara si el numero es impar
	public static  boolean Impar(int n) {
		
		return n % 2 != 0;
		
	}
	
	//Calcula segun el simbolo entregado
	public static double Calculadora(double num1, double num2, char operacion) {
		double resultado;
		
		switch(operacion) {
			case '+'->{
				resultado=num1+num2;
			}
			case '-'->{
				resultado=num1-num2;
			}
			case '/'->{
				resultado=num1/num2;
			}
			case '*'->{
				resultado=num1*num2;
			}
			case '%'->{
				resultado=num1%num2;
			}
			default ->{
				resultado=0;
				break;
			}
		}
			
		return resultado;
	}
	
	
	//Da el factorial
	public static long Factorial(int n) {
		int resultado=1;
		
		for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
     
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int num1,num2;
		char operacion;
		
		System.out.print("Introduce el primer numero: ");
		num1 = scanner.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		num2 = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Introduce la operacion deseada (+,-,/,*,%): ");
		operacion = scanner.nextLine().charAt(0);
		
		System.out.println("Impar= "+ Impar(num1));
		
		System.out.println("Factorial= "+ Factorial(num1));
		
		System.out.println("Resultado= "+Calculadora(num1,num2,operacion));

	}
}
