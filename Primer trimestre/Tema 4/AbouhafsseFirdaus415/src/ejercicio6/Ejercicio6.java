/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 25/11/2025
* Contenido: Crear un metodo boolean que recibe unos parametros y devuelve un resultado segun unas comprobaciones
*
*/

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce salario del jefe: ");
		double salarioJefe = sc.nextDouble();

		System.out.print("Introduce salario del encargado: ");
		double salarioEncargado = sc.nextDouble();

		System.out.print("Introduce salario de un oficinista: ");
		double salarioOficinistas = sc.nextDouble();

		System.out.print("Introduce el número de oficinistas: ");
		int numeroOficinistas = sc.nextInt();

		System.out.print("¿Proyectos terminados? (true/false): ");
		boolean proyectosTerminados = sc.nextBoolean();

		System.out.print("Introduce presupuesto de la empresa: ");
		double presupuesto = sc.nextDouble();


		boolean resultado = auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas,
				proyectosTerminados, presupuesto);

		System.out.println("Resultado auditoría: " + resultado);
	}


	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas,
			int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {

		if (!proyectosTerminados) {
			System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados.");
			return false;
		}

		double gastoTotal = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);

		if (gastoTotal > 20000) {
			System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoTotal
					+ " y excede el límite mensual de 20.000 euros.");
			return false;
		}

		if (presupuestoEmpresa > 100000) {
			System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa
					+ " excede el límite establecido de 100.000 euros.");
			return false;
		}

		System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene.");
		return true;
	}

}
