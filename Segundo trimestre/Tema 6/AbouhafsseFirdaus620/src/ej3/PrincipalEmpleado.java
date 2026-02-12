package ej3;

import java.util.Scanner;

public class PrincipalEmpleado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Empleado empleado1 = null;
        Empleado empleado2 = null;
        Empleado empleado3 = null;


        //CREAR EMPLEADO 1
        boolean creado = false;

        while (!creado) {
            try {
                System.out.print("Introduce NIF empleado 1: ");
                String nif = sc.next();

                System.out.print("Introduce apellidos empleado 1: ");
                String apellidos = sc.next();

                System.out.print("Introduce nombre empleado 1: ");
                String nombre = sc.next();

                empleado1 = new Empleado(nif, apellidos, nombre);
                creado = true;

            } catch (IllegalArgumentException e) {
                System.out.println("Error al crear empleado 1: " + e.getMessage());
            }
        }


        //CREAR EMPLEADO 2
        creado = false;

        while (!creado) {
            try {
                System.out.print("\nIntroduce nombre empleado 2: ");
                String nombre = sc.next();

                System.out.print("Introduce apellidos empleado 2: ");
                String apellidos = sc.next();

                System.out.print("Introduce NIF empleado 2: ");
                String nif = sc.next();

                System.out.print("Introduce sueldo base: ");
                double sueldoBase = sc.nextDouble();

                System.out.print("Introduce pago por hora extra: ");
                double pagoHoraExtra = sc.nextDouble();

                System.out.print("Introduce horas extra del mes: ");
                int horasExtra = sc.nextInt();

                System.out.print("Introduce tipo IRPF: ");
                double tipoIRPF = sc.nextDouble();

                System.out.print("¿Está casado? (true/false): ");
                boolean casado = sc.nextBoolean();

                System.out.print("Introduce número de hijos: ");
                int hijos = sc.nextInt();

                empleado2 = new Empleado(
                        nombre,
                        apellidos,
                        nif,
                        sueldoBase,
                        pagoHoraExtra,
                        horasExtra,
                        tipoIRPF,
                        casado,
                        hijos
                );

                creado = true;

            } catch (IllegalArgumentException e) {
                System.out.println("Error al crear empleado 2: " + e.getMessage());
                sc.nextLine(); // limpiar buffer
            }
        }


        //SOLICITAR SUELDO BASE Y HORAS EXTRAS DE EMPLEADO 1
        boolean correcto = false;

        while (!correcto) {
            try {
                System.out.print("\nIntroduce sueldo base empleado 1: ");
                empleado1.setSueldoBase(sc.nextDouble());
                correcto = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        correcto = false;

        while (!correcto) {
            try {
                System.out.print("Introduce horas extra empleado 1: ");
                empleado1.setHorasExtraMes(sc.nextInt());
                correcto = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        //MOSTRAMOS RESULTADO
        empleado1.verTodoEmpleado();


        
        //CLONAMOS EMPLEADO 2
        empleado3 = empleado2.copia();


        
        //SOLICITAMOS LOS DATOS DEL EMPLEADO 3
        correcto = false;

        while (!correcto) {
            try {
                System.out.print("\nIntroduce sueldo base empleado 3: ");
                empleado3.setSueldoBase(sc.nextDouble());
                correcto = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        correcto = false;

        while (!correcto) {
            try {
                System.out.print("Introduce horas extra empleado 3: ");
                empleado3.setHorasExtraMes(sc.nextInt());
                correcto = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        empleado3.verTodoEmpleado();


        //MOSTRAR EMPLEADOS
        System.out.println("\n=== LISTADO DE EMPLEADOS ===");
        empleado1.verEmpleado();
        System.out.println("---------------------------");
        empleado2.verEmpleado();
        System.out.println("---------------------------");
        empleado3.verEmpleado();

        System.out.println("\nNúmero total de empleados: " +
                Empleado.getCantidadEmpleados());

        sc.close();
    }
}
