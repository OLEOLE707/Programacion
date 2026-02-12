/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 21/11/2025
* Contenido: Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. 
*	
*/

package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
	
	public static char letraDNI(int dni) { //Devolvera la posicion del array donde este la letra correspondiente
		
		char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		return letras[dni%23];
	}
	
	
	
  
    public static boolean dniValido(String dni) { //Para comprobar que sea un dígito (0-9) 8 veces
    	
        return dni.matches("[0-9]{8}");
    }
	
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String dniStr;
        int dni;

        do {
            System.out.print("Introduce tu DNI: ");
            dniStr = scanner.nextLine();

            if (!dniValido(dniStr)) {
                System.out.println("Formato incorrecto. Debe tener 8 números.");
            }

        } while (!dniValido(dniStr));
        

        dni=Integer.parseInt(dniStr);
        
        
        System.out.println("El DNI completo es: " + dni + letraDNI(dni));

	}

}
