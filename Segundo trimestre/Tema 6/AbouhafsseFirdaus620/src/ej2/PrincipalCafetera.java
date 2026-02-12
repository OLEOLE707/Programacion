/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 03/02/2026
* Contenido: Crear el main de la clase cafetera
*/


package ej2;

public class PrincipalCafetera {

	public static void main(String[] args) {
		
		Cafetera llena, vacia;
		
		//Creamos las cafeteras
		try {
			 llena = new Cafetera(1000);
		}catch(IllegalArgumentException e) {
			System.out.print(e.getMessage());
			
			llena=new Cafetera();
		}

		vacia = new Cafetera();
		
		
		//llenamos la cafetera vacía
		try {
			vacia.llenarCafetera(250);
		}catch(IllegalArgumentException e) {
			System.out.print(e.getMessage());
		}
		
		
		//llenar tazas hasta que se agoten
		do {
			try {
				vacia.servirTaza(20);
			}catch(IllegalArgumentException e) {
				System.out.print(e.getMessage());
				
			}catch(IllegalStateException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.printf("Taza llenada, cantidadActual %d\n",vacia.getCantidadActual());
			
		}while(vacia.getCantidadActual()>0);
		
		
		
		//Servir 50 cafes de 50cc cada uno, si hace falta rellenar la cafetera
		System.out.println("----------------------------");
		System.out.println("CAFETERA QUE LLENA 50 VASOS");
		System.out.println("----------------------------");
		for(int i=0; i<50; i++) {
		
			try {
				llena.servirTaza(50);
				
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				
			}catch(IllegalStateException e) {
				System.out.println(e.getMessage());
				
				System.out.printf("----Rellenando cafetera %dcc\n",llena.getCapacidadMaxima());
				llena.llenarCafetera(llena.getCapacidadMaxima());
				llena.servirTaza(50);

			}
			
			System.out.printf("Taza %d llenada\n",i+1);
			
			System.out.printf("Capacidad actual: %d\n", llena.getCantidadActual());


		}
		
		
	}

}
