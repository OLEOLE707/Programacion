/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 26/11/2025
* Contenido: Segun una tabla dada calcular diferentes cosas utilizando metodos
*
*/

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	//Devuelve el dia con mas ataques para cada provincia (i)
	public static int diaMasAtaques(int[][]ataquesDia, int i){ 
		int masAtaques=0, dia=0;
		
		for(int j=0; j<16; j++) {
			
			if(masAtaques<ataquesDia[i][j]) {
				masAtaques=ataquesDia[i][j];
				dia=j;		
			}
		}
		return dia+1;
	}
	
	
	//Devuelve la provincia con mas ataques ese dia
	public static int[] masAtaquesDia(int[][] ataquesDia) {
	    int[] provinciaMax = new int[16];
	    
	    for (int j = 0; j < 16; j++) {
	        int max = -1;
	        int prov = -1;
	        
	        for (int i = 0; i < 8; i++) {
	            if (ataquesDia[i][j] > max) {
	                max = ataquesDia[i][j]+max;
	                prov = i;
	            }
	        }

	        provinciaMax[j] = prov;
	    }

	    return provinciaMax;
	}
	
	
	
    // Día con más ataques de toda Andalucía
    public static int diaConMasAtaques(int[][] ataquesDia) {
        int max = -1;
        int diaMax = 0;

        for (int j = 0; j < 16; j++) {
            int sumaDia = 0;

            for (int i = 0; i < 8; i++) {
                sumaDia += ataquesDia[i][j];
            }

            if (sumaDia > max) {
                max = sumaDia;
                diaMax = j;
            }
        }

        return diaMax + 1;
    }
	
	
	
	//Pide un dia y una provincia y muestra si hubo algún ataque 
	public static void compruebaAtaques(int[][] ataquesDia, String[] provincias) {
		Scanner scanner = new Scanner(System.in);
		
		int dia, nProvincia=0;
		String provincia;
		
		System.out.print("Introduce la provincia que quieras comprobar: ");
		provincia=scanner.nextLine();
		
		System.out.print("Introduce el dia que quieras comprobar: ");
		dia=scanner.nextInt();
		
		for(int i=0;i<8;i++) {
			if(provincias[i]==provincia) {
				nProvincia=i;
			}
		}
		
		if(ataquesDia[nProvincia][(dia-1)]==0) {
			System.out.println("Ese dia no hubo ataques");
		}else {
			System.out.println("Ese dia hubo "+ataquesDia[nProvincia][dia-1]+" ataques");
		}

	}
	

	public static void main(String[] args) {
		//Importamos el escaner
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int[][] ataquesDia = 
				{{0, 31, 1, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 33, 42, 22},
				{24, 56, 7, 0, 0, 0, 0, 0, 0, 0, 2, 12, 2, 10, 30, 29},
				{17, 22, 5, 0, 0, 0, 0, 0, 0, 1, 2, 9, 1, 13, 36, 32},
				{2, 41, 2, 0, 0, 0, 0, 0, 0, 0, 1, 7, 0, 11, 13, 32},
				{0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 11, 58, 3},
				{18, 8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1, 7, 50, 36},
				{1, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 17, 35, 64},
				{7, 3, 1, 0, 0, 0, 0, 0, 0, 0, 5, 7, 0, 26, 23, 0}};
		
		
		String[] provincias= {"Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla"};
		
		
		
		//Mostramos los dias con más ataques
		for(int i=0; i<8; i++) {
			System.out.println("Dias con mas ataques de "+provincias[i]+": "+diaMasAtaques(ataquesDia, i));
		}
			
		System.out.println("\n");

		//Mostramos la provincia con mas ataques
		for(int j=0; j<16; j++) {
			System.out.println("Provincia con más ataques el "+ (j+1) +": "+provincias[masAtaquesDia(ataquesDia)[j]]);
			
		}
		
		System.out.println("\n");
		
		//Mostramos el dia con más ataques
		System.out.println("El día con más ataques de todo andalucía fue: "+diaConMasAtaques(ataquesDia));
		
		System.out.println("\n");
		
		compruebaAtaques(ataquesDia, provincias);
				
	}

}
