/*
 * Descripción: Calcular el salario bruto y neto y mostrarlo en pantalla
 * Autor: Firdaus Abouhafsse
 * Fecha:30/09/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		
		//VARIABLES
		String nombre, apellidos;
		double salarioBruto, salarioNeto, salarioTotal;
		int anyos, nacimiento, aumento;
		
		
		//PEDIDA DE DATOS
		System.out.print("Introduzca su nombre: ");
		nombre=scanner.nextLine();
		
		System.out.print("Introduzca sus apellidos: ");
		apellidos=scanner.nextLine();
		
		System.out.print("Introduzca su fecha de nacimiento seguida: ");
		nacimiento=scanner.nextInt();
		
		System.out.print("Introduzca su salarioBruto: ");
		salarioBruto=scanner.nextDouble();
		
		System.out.print("Introduzca los años que ha trabajado para la empresa: ");
		anyos=scanner.nextInt();
		
		//CALCULOS
		salarioNeto=salarioBruto-((salarioBruto*15)/100);
		aumento=(anyos*2);
		salarioTotal=(salarioNeto*aumento/100)+salarioNeto;
		
		
		//SOLUCION
		System.out.println("\nEstimad@ "+nombre+" "+apellidos+", su salario bruto es de "+salarioBruto+", teniendo en\ncuenta un IRPF del 15%, su salario neto es "+salarioNeto+"." );
		
		System.out.println("\nDebido a sus "+anyos+" años trabajando en la empresa su salario se incrementará en un 2% por cada año. \r\nEl aumento es de "+aumento+"%y el salario total es de "+salarioTotal+" .");
		
		
		
	
		

	}

}
