/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 29/01/2026
* Contenido: Crear la clase Empleado
*/

package ej3;

public class Empleado implements Cloneable {

    // Atributos
    private static int cantidadEmpleados = 0;

    private String nif;
    private String apellidos;
    private String nombre;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horasExtraMes;
    private double tipoIRPF;
    private boolean casado;
    private int numeroHijos;

    // Constructor de 9 parámetros
    public Empleado(String nombre, String apellidos, String nif,
                    double sueldoBase, double pagoHoraExtra,
                    int horasExtraMes, double tipoIRPF,
                    boolean casado, int numeroHijos) {


        if (nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("Nombre no válido");

        if (apellidos == null || apellidos.isEmpty())
            throw new IllegalArgumentException("Apellidos no válidos");

        if (nif == null || !validarDni(nif))
            throw new IllegalArgumentException("DNI no válido");

        if (sueldoBase < 0)
            throw new IllegalArgumentException("El sueldo base no puede ser negativo");

        if (pagoHoraExtra < 0)
            throw new IllegalArgumentException("El pago por hora extra no puede ser negativo");

        if (horasExtraMes < 0)
            throw new IllegalArgumentException("Las horas extra no pueden ser negativas");

        if (tipoIRPF < 0)
            throw new IllegalArgumentException("El tipo de IRPF no puede ser negativo");

        if (numeroHijos < 0)
            throw new IllegalArgumentException("El número de hijos no puede ser negativo");


        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtraMes = horasExtraMes;
        this.tipoIRPF = tipoIRPF;
        this.casado = casado;
        this.numeroHijos = numeroHijos;

        cantidadEmpleados++;
    }

    // Constructor mínimo
    public Empleado(String nif, String apellidos, String nombre) {
        this(nombre, apellidos, nif, 0, 0, 0, 0, false, 0);
    }

    
    //Setters
    public void setSueldoBase(double sueldoBase) {
        if (sueldoBase < 0)
            throw new IllegalArgumentException("El sueldo base no puede ser negativo");
        this.sueldoBase = sueldoBase;
    }

    public void setHorasExtraMes(int horasExtraMes) {
        if (horasExtraMes < 0)
            throw new IllegalArgumentException("Las horas extra no pueden ser negativas");
        this.horasExtraMes = horasExtraMes;
    }

    // Complemento horas extra
    public double calcularComplementoHorasExtra() {
        return horasExtraMes * pagoHoraExtra;
    }

    // Sueldo bruto
    public double calcularSueldoBruto() {
        return sueldoBase + calcularComplementoHorasExtra();
    }

    // Retención IRPF
    public double calcularRetencionIRPF() {
        double porcentaje = tipoIRPF;

        if (casado) porcentaje -= 2;
        porcentaje -= numeroHijos;

        if (porcentaje < 0) porcentaje = 0;

        return calcularSueldoBruto() * porcentaje / 100;
    }

    // Sueldo neto
    public double calcularSueldoNeto() {
        return calcularSueldoBruto() - calcularRetencionIRPF();
    }

    // Visualización básica
    public void verEmpleado() {
        System.out.println("NIF: " + nif);
        System.out.println("Nombre: " + nombre + " " + apellidos);
    }

    // Visualización completa
    public void verTodoEmpleado() {
        verEmpleado();
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Horas extra: " + horasExtraMes);
        System.out.println("Pago hora extra: " + pagoHoraExtra);
        System.out.println("Complemento horas extra: " + calcularComplementoHorasExtra());
        System.out.println("Sueldo bruto: " + calcularSueldoBruto());
        System.out.println("Retención IRPF: " + calcularRetencionIRPF());
        System.out.println("Sueldo neto: " + calcularSueldoNeto());
        System.out.println("-----------------------------------");
    }

    // Clonación
    public Empleado copia() {
        try {
            return (Empleado) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Total empleados
    public static int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

	
	//validarDni
	private static final char[] LETRAS_DNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public static boolean validarDni(String dni) {
		if (dni == null || dni.length() != 9) {
			return false; // Longitud incorrecta
		}

		String numeros = dni.substring(0, 8);
		char letraIntroducida = Character.toUpperCase(dni.charAt(8));

		// Validar que los primeros 8 sean números
		if (!numeros.matches("\\d+")) {
			return false;
		}

		int num = Integer.parseInt(numeros);
		int resto = num % 23;
		char letraCalculada = LETRAS_DNI[resto];

		// Comparar la letra calculada con la introducida
		return letraCalculada == letraIntroducida;
	}
}

