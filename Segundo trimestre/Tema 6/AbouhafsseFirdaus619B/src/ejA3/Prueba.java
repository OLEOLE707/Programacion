/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Main de la clase Rectángulo
*
*/

package ejA3;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejA1.Punto;

public class Prueba {
	
	public static Rectangulo comprobador(Rectangulo rec) {
		Scanner scanner = new Scanner(System.in);
		
		int x1, x2, y1, y2;
		
		try {
			
			System.out.print("Introduce x1: ");
			x1= scanner.nextInt();
			
			System.out.print("Introduce x2: ");
			x2= scanner.nextInt();
			
			System.out.print("Introduce y1: ");
			y1= scanner.nextInt();
			
			System.out.print("Introduce y2: ");
			y2= scanner.nextInt();
			
			
			
			rec = new Rectangulo(x1,y1,x2,y2);
		
		}catch(IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage()+" Rectangulo reiniciado a (0,0)(0,0)");

			rec = new Rectangulo(0,0,0,0);
		
		}catch(InputMismatchException ex2) {
			System.out.println(ex2.getMessage()+" Rectangulo reiniciado a (0,0)(0,0)");

			rec = new Rectangulo(0,0,0,0);
		}
		
		return rec;
	}
	

	public static void main(String[] args) {
		//Instanciamos dos objetos rectangulos
		
		System.out.println("RECTANGULO A");
		Rectangulo a = new Rectangulo(0,0,0,0);
		a= comprobador(a);
		
		
		System.out.println("\nRECTANGULO B");
		Rectangulo b = new Rectangulo(0,0,0,0);
		b = comprobador(b);		
		
		
		a.x1=0;
		a.x2=5;
		a.y1=0;
		a.y2=5;
		
		b.x1=7;
		b.x2=2;
		b.y1=9;
		b.y2=3;
		
		//Coordenadas
		System.out.println("COORDENADAS RECTANGULO A\n------------ \n("+a.x1+","+a.y1+"), "+"("+a.x2+","+a.y2+")");
		System.out.println("\nCOORDENADAS RECTANGULO B\n------------ \n("+b.x1+","+b.y1+"), "+"("+b.x2+","+b.y2+")");
		
		//Perimetros
		System.out.println("\nPrimetro a:"+2*((a.x2-a.x1)+(a.y2-a.x2)));
		System.out.println("Perimetro b:"+Math.abs(2*((b.x2-b.x1)+(b.y2-b.y1))));
		
		//Areas
		System.out.println("\nÁrea a:"+(a.x2-a.x1)*(a.y2-a.x2));
		System.out.println("Área b:"+Math.abs((b.x2-b.x1)*(b.y2-b.x2)));
		
		//mODIFICAMOS ELEMENTOS
		System.out.println("\nMODIFICAMOS ELEMENTOS\n-----------------------\n");
		a.x1+=10;
		a.x2-=2;
		a.y1+=30;
		a.y2/=2;
		
		b.x1*=2;
		b.x2-=1;
		b.y1/=3;
		b.y2+=1;
		
		//Coordenadas
		System.out.println("COORDENADAS RECTANGULO A\n------------ \n("+a.x1+","+a.y1+"), "+"("+a.x2+","+a.y2+")");
		System.out.println("\nCOORDENADAS RECTANGULO B\n------------ \n("+b.x1+","+b.y1+"), "+"("+b.x2+","+b.y2+")");
		
		//Perimetros
		System.out.println("\nPrimetro a:"+Math.abs(2*((a.x2-a.x1)+(a.y2-a.x2))));
		System.out.println("Perimetro b:"+Math.abs(2*((b.x2-b.x1)+(b.y2-b.y1))));
		
		//Areas
		System.out.println("\nÁrea a:"+(a.x2-a.x1)*(a.y2-a.x2));
		System.out.println("Área b:"+Math.abs((b.x2-b.x1)*(b.y2-b.x2)));

	}

}
