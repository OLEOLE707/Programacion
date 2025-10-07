/*
*
*
*
*/

package Test20preguntas;
import java.util.Scanner;
public class test20preguntas {

	public static void main(String[] args) {
		//Escáner
		Scanner scanner= new Scanner(System.in);
		
		
		//Variables
		int acertadas, falladas, total;
		double nota;
		
		System.out.print("Introduce el número de preguntas acertadas: ");
		acertadas=scanner.nextInt();

		System.out.print("Introduce el número de preguntas falladas: ");
		falladas=scanner.nextInt();

		
		//Operaciones
		total=acertadas+falladas;
		
		
		//Condiciones
		if(total<0 || total>20) {
			System.out.println("Datos erróneos");
		
		}else { //Datos validos
			
			nota=(acertadas+(falladas*(-0.5)))/2;
			System.out.println("\n");
			
			//Si es negativa se vuelve 0
			if(nota<0) {
				nota=0;
			}
			
			if(nota>=0 && nota<5){
				System.out.println("Tu nota es: "+nota+" (Suspenso)");
				
			}else if(nota==5) {
				System.out.println("Tu nota es: "+nota+" (Aprobado)");
				
			}else if(nota==6) {
				System.out.println("Tu nota es: "+nota+" (Bien)");
				
			}else if(nota<9){
				System.out.println("Tu nota es: "+nota+" (Notable)");
				
			}else {
				System.out.println("Tu nota es: "+nota+" (Sobresaliente)");
			}
		
		}

	}

}
