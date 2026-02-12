package clase_Ticket;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {


	// Atributos de clase constantes
	public final static int MAX_SEQUENCE = 99999999;
	
	// Atributos de clase variables
	private static short anyo_actual = (short) LocalDate.now().getYear(); // Año actual
	private static int inicioSecuencia = 0; 


	// Atributos de objeto inmutables
	private final LocalDate fecha_uso; // Fecha para usar el ticket
	private final String id; // Id del ticket

	// Atributos de objeto variables (estado)
	private LocalTime usado; // Momento de uso del ticket

	// Constructor
	public Ticket(LocalDate fecha_uso) throws IllegalArgumentException, IllegalStateException {

		LocalDate hoy = LocalDate.now();

		if (fecha_uso == null) {
			throw new IllegalArgumentException("fecha inválida (null)");
		}
		if (fecha_uso.isBefore(hoy)) {
			throw new IllegalArgumentException("fecha de uso anterior a la actual");
		}
		if (fecha_uso.getYear() > hoy.getYear()) {
			throw new IllegalArgumentException("fecha de uso posterior al año actual");
		}
		if (Ticket.inicioSecuencia == Ticket.MAX_SEQUENCE) {
			throw new IllegalStateException("expedidos el número máximo de tickets para este año");
		}

		// Inicializamos atributos de objeto
		this.usado = null; // El ticket aún no ha sido usado
		this.fecha_uso = fecha_uso; // Registramos la fecha en que podrá ser usado

		// Comprobamos si se ha cambiado de año desde la generación del último ticket
		if (Ticket.anyo_actual != hoy.getYear()) {
			Ticket.inicioSecuencia = 0; // Se reinicia la secuencia
			Ticket.anyo_actual = (short) hoy.getYear(); // Se registra el nuevo año
		}
		// Generamos el id del ticket e incrementamos el número de secuencia
		id = String.format("%04d-%08d", hoy.getYear(), ++Ticket.inicioSecuencia);
	}

	
	
	// Sin párametros
	public Ticket() {
		this(LocalDate.now());
	}

	
	
	// GUETTERS
	public String getId() { // Devuelve el id
		return this.id;
	}

	public LocalDate getFecha() { // Devuelve la fecha en la que podra ser creado el ticket
		return this.fecha_uso;
	}

	public boolean isUsado() { // Devuelve si ha sido usado o no
		return usado != null;
	}

	public boolean isFinDeSemana() { // Devuelve si la fecha de uso es para un fin de semana
		if (fecha_uso.getDayOfWeek() == DayOfWeek.FRIDAY || fecha_uso.getDayOfWeek() == DayOfWeek.SATURDAY
				|| fecha_uso.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return true;
		} else {
			return false;
		}
	}

	
	
	//Metodos
	public void usar() throws IllegalArgumentException {
		if (!this.fecha_uso.isEqual(LocalDate.now())) {
			throw new IllegalStateException(String.format("El ticket no es para hoy: %s", String.format("%02d/%02d/%02d", this.fecha_uso.getDayOfMonth(), this.fecha_uso.getMonthValue(), this.fecha_uso.getYear())));
		}

		if (isUsado()) {
			throw new IllegalStateException(String.format("El ticket ya ha sido usado: %s", this.usado));
		}

		// Si es posible usar el ticket lo marcamos como usado
		usado = LocalTime.now();
	}

}
