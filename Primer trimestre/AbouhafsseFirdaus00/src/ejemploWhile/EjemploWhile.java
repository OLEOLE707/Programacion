package ejemploWhile;

import java.util.Scanner;

public class EjemploWhile {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int inicio,fin,enumeracion=1;
		System.out.print("Introduce el inicio deseado: ");
		inicio=scanner.nextInt();
		
		System.out.print("Introduce el fin deseado: ");
		fin=scanner.nextInt();
		
		
		if(inicio>fin) {
			while(inicio>=fin) {
				
				System.out.print(inicio+" ");
				inicio--;
				
			}
		}else {
			while(inicio<=fin) {
				
				System.out.print(inicio+" ");
				inicio++;
				
			}
		}


	}

}
