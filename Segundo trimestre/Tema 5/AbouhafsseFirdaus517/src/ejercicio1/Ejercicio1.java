/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 02/12/2025
* Contenido: Usando la clase Dado, que se incluye en la librería, construir un programa que simule un juego de lanzamiento de dados.
*
*/


package ejercicio1;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {
		
	//Apartado 1
		
		int valorMax=(int)(Math.random()*(60-30+1))+30;
		
		int puntos1=0, puntos2=0, puntos3=0, ganadorNum=1, ultimoGanador, sumaPuntos1=0, sumaPuntos2=0, sumaPuntos3=0, ultimoPunto=0;
		
		
		
		//5.1
		System.out.printf("Número máximo de puntos: %s\n\n",valorMax);
		
		
	//Apartado 2
		//Tres dados de seis caras cada uno
		Dado dado1= new Dado(6);
		Dado dado2= new Dado(6);
		Dado dado3= new Dado(6);
		
		
	//Apartado 3
		//5.2
		System.out.println("\t\tDADO 1\tDADO2\tDADO3\n");
		
		while (dado1.getSumaPuntuacionHistorica()+ dado2.getSumaPuntuacionHistorica()+ dado3.getSumaPuntuacionHistorica()< valorMax){

		    puntos1 = dado1.lanzar();
		    puntos2 = dado2.lanzar();
		    puntos3 = dado3.lanzar();
		    
		    sumaPuntos1+=puntos1;
		    sumaPuntos2+=puntos2;
		    sumaPuntos3+=puntos3;
		    
		    
		    System.out.printf("Tirada nº %s:\t  %s\t  %s\t  %s\n",((int)Dado.getNumeroLanzamientosGlobal()/3), puntos1 ,puntos2, puntos3);
		
		}
		
	//Apartado 4
		Dado ganador = dado1;
		ganadorNum = 1;
		ultimoGanador = puntos1;
	    ultimoPunto=puntos1;
		
		if (puntos2 > ultimoGanador) {
		    ganador = dado2;
		    ganadorNum = 2;
		    ultimoGanador = puntos2;
		    ultimoPunto=puntos2;
		}

		
		if (puntos3 > ultimoGanador) {
		    ganador = dado3;
		    ganadorNum = 3;
		    ultimoGanador = puntos3;
		    ultimoPunto=puntos3;
		}
		
	//Apartado 5
		
		//5.3
		System.out.printf("\nJuego Terminado. La suma de los lanzamientos es: %d\n", dado1.getSumaPuntuacionHistorica() + dado2.getSumaPuntuacionHistorica() + dado3.getSumaPuntuacionHistorica());
		
		//5.4
		System.out.printf("El ganador es el dado %s con %s puntos en su última tirada\n",ganadorNum,ultimoPunto);
		
		//5.5 y 5.6
		System.out.printf("El valor %s ha salido %s veces en todo el juego y se han realizado un total de %s lanzamientos.\n",ultimoPunto,Dado.getNumeroVecesCaraGlobal(ultimoPunto),Dado.getNumeroLanzamientosGlobal());

		//5.7
		System.out.println("Todos los lanzamiento del dado "+ganadorNum+" son: "+ganador.getSerieHistoricaLanzamientos());

	}

}
