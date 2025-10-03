package ejercicioResuelto3;

import java.util.Scanner;

public class ejercicioResuelto3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double metros,pies,yardas,pulgadas;
		
		System.out.print("Introduce la medida en metros: ");
		metros=scanner.nextDouble();
		
		
		pulgadas=(metros*100)/2.54;
		pies=pulgadas/12;
		yardas=pies/3;
		
		
		System.out.println("\nRESULTADO");
		System.out.println("---------");
		
		
		System.out.println("\nSISTEMA INTERNACIONAL");
		System.out.println("-------------------------");
		
		
		System.out.println("La medida "+metros+" en metros son:");
		System.out.println(metros*10+" decímetros");
		System.out.println(metros*100+" centímetros");
		System.out.println(metros*1000+" milímetros");
		
		
		
		
		System.out.println("\nSISTEMA ANGLOSAJÓN");
		System.out.println("-----------------------");
		System.out.println("La medida "+metros+" en metros son:");
		System.out.println(pulgadas+" pulgadas");
		System.out.println(pies +" pies");
		System.out.println(yardas+" yardas");
	}

}
