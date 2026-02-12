package Test20preguntasSwitch;

import java.util.Scanner;

public class test20preguntasSwitch {

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
		if(total>20) {
			System.out.println("Datos erróneos");
			
		}else { //Datos validos positivos
			
			nota=(acertadas+(falladas*(-0.5)))/2;
			
			//Si es negativa se vuelve 0
			if(nota<0) {
				nota=0;
			}
			
			//Mostramos la nota numérica
			System.out.println("\nTu nota númerica es: "+nota);
			
			//Redondeamos
			nota= Math.round(nota);

			//Casos switch
			switch((int)nota){
				case 0,1,2,3,4-> System.out.println("Tu nota es: Insuficiente");
				case 5-> System.out.println("Tu nota es: Suficiente");
				case 6-> System.out.println("Tu nota es: Bien");
				case 7,8-> System.out.println("Tu nota es: Notable");
				case 9-> System.out.println("Tu nota es: Sobresaliente");
				case 10-> System.out.println("Tu nota es: Matrícula de honor");
		
			}

		}

	}	

}
