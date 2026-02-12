package ejercicioResuelto2;

import java.util.Scanner;

public class ejercicioResuelto2 {

    public static void main(String[] args) {
   
        double numero1, numero2;
        double resultado1, resultado2, resultado3, resultado4;

        Scanner teclado= new Scanner (System.in);

        System.out.println("CÁLCULOS ARITMÉTICOS");
        System.out.println("--------------------");
        System.out.println("Introduzca dos números reales: ");
        System.out.print("Primer número: ");
        numero1= teclado.nextDouble();
        System.out.print("Segundo número: ");
        numero2= teclado.nextDouble();

        resultado1= 2.0 * numero1;

        resultado2= numero2 / 2.0;

        resultado3= (numero1 + numero2) * (numero1 + numero2);

        resultado4= (numero1*numero1 + numero2*numero2) / 10.0;
        

        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println ("Doble del primer número: " + resultado1);
        System.out.println ("Mitad del segundo número: " + resultado2);
        System.out.println ("Cuadrado de la suma de ambos números: " + resultado3);
        System.out.println ("Décima parte de la suma de los cuadrados de ambos números: " + resultado4);
                
        System.out.println ();
        System.out.println ("Fin del programa. Bye!");     
    }
 }