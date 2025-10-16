package ejemploDoWhile;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int inicio,fin,enumeracion=1;
		
		System.out.print("Introduce el inicio deseado: ");
		inicio=scanner.nextInt();
		
		System.out.print("Introduce el fin deseado: ");
		fin=scanner.nextInt();
		
		
		if(inicio>fin) {
			do {	
				System.out.print(inicio+" ");
				inicio--;
			}while(inicio>=fin);
			
		}else {
			do {	
				System.out.print(inicio+" ");
				inicio++;
			}while(inicio<=fin);
			
		}


	}

}