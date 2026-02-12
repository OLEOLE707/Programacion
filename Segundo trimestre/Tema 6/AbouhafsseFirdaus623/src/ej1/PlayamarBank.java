/**
 * @author Firdaus
 * @version 12/02/2026
 * Clase que representa una <strong>cuenta bancaria llamada PlayamarBank</strong>.
 * <p>
 * Los objetos de esta clase contienen atributos que permiten almacenar
 * información sobre:</p>
 * <ul>
 * <li><strong>Identificador</strong> de la cuenta. Este valor se establecerá
 * al crear la cuenta y ya no podrá cambiar. Es un valor constante.</li>
 * <li><strong>Fecha de creacion</strong> de la cuenta. Es también un valor
 * constante. Se establecerá al crear la cuenta y ya no podrá cambiar su valor.</li>
 * <li><strong>Porcentaje de embargo</strong> de la cuenta.</li>
 * <li><strong>Saldo actual</strong> de la cuenta.</li>
 * <li><strong>Saldo máximo</strong> que ha tenido la cuenta a lo largo de su
 * historia.</li>
 * <li><strong>Ingresos totales</strong> que ha tenido la cuenta a lo largo de
 * su historia.</li>
 * </ul>
 * <p>
 * La clase también dispone de información general independiente de los objetos
 * concretos que se hayan creado. Es el caso de:</p>
 * <ul>
 * <li><strong>Saldo global</strong> entre todas las cuentas en el momento
 * actual.</li>
 * <li><strong>Número de cuentas embargadas</strong> en el momento actual.</li>
 * <li><strong>Fecha de creación</strong> de la <strong>cuenta más moderna</strong>
 * creada hasta el momento actual.</li>
 * </ul>
 */

package ej1;

import java.time.LocalDate;

public class PlayamarBank {

	// ---------------
	// ATRIBUTOS
	// -------------
	/**
	 * Descubierto máximo permitido al crear una cuenta : {@value MAX_DESCUBIERTO}
	 * euros.
	 */
	public static final double MAX_DESCUBIERTO = -2_000.00; // euros
	/**
	 * Embargo mínimo de una cuenta : {@value MIN_EMBARGO}%.
	 */
	public static final double MIN_EMBARGO = 0.00; // porcentaje
	/**
	 * Embargo máximo de una cuenta: {@value MAX_EMBARGO} %.
	 */
	public static final double MAX_EMBARGO = 100.00; // porcentaje
	/**
	 * Año mínimo para la creación de una cuenta: {@value MIN_YEAR}.
	 */
	public static final int MIN_YEAR = 1900; // año
	/**
	 * Saldo máximo para una cuenta: {@value MAX_SALDO} euros.
	 */
	public static final double MAX_SALDO = 50_000_000.00; // euros
	/**
	 * Saldo inicial por omisión para una cuenta: {@value DEFAULT_SALDO} euros.
	 */
	public static final double DEFAULT_SALDO = 0.00; // euros
	/**
	 * Límite de descubierto por omisión para una cuenta:
	 * {@value DEFAULT_MAX_DESCUBIERTO} euros.
	 */
	public static final double DEFAULT_MAX_DESCUBIERTO = 0.00; // euros

	private final String Id_cuenta = null;
	private final LocalDate fechaCreacion = null;

	private int idCuenta;
	private int porEmbargo;
	private double saldoActual;
	private double saldoMaximo;
	private double ingresosTotales;

	// ------------------
	// Constructores
	// -----------------

	/**
	 * Constructor con tres parámetros
	 *
	 * @param saldoInicial      Saldo inicial de la cuenta (en euros)
	 * @param fechaCreacion     Fecha de creación de la cuenta
	 * @param limiteDescubierto Límite de descubierto de lacuenta (en euros)
	 * @throws IllegalArgumentException Si alguno de los parámetros no es válido
	 */
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion, double limiteDescubierto)
			throws IllegalArgumentException {

	}

	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion) throws IllegalArgumentException {
		this(saldoInicial, fechaCreacion, PlayamarBank.DEFAULT_MAX_DESCUBIERTO);
	}

	public PlayamarBank(double saldoInicial) throws IllegalArgumentException {
		this(saldoInicial, LocalDate.now());
	}

	public PlayamarBank() {
		this(PlayamarBank.DEFAULT_SALDO);
	}

	// -------------------
	// Guetters y setters
	// -------------------
	/**
	 * Obtiene el saldo actual de la cuenta
	 * @return saldo actual de la cuenta
	 */
	public double getSaldo() {
		return this.saldoActual;
	}

	// ---------------
	// Metodos
	// ----------------
	/**
	 * Ingresa una determinada cantidad en la cuenta. Se permiten ingresos de 0.00
	 * euros.
	 *
	 * @param cantidad Cantidad que se desea ingresar (en euros). Se permite
	 *                 ingresar 0.00 euros.
	 * @throws IllegalArgumentException Si la cantidad de ingreso es inválida
	 *                                  (negativa).
	 * @throws IllegalStateException    Si con ese ingreso se superaría el saldo
	 *                                  máximo. En tal caso no se llevaría a cabo el
	 *                                  ingreso.
	 */
	public void ingresar(double cantidad) throws IllegalArgumentException, IllegalStateException {
	}

	/**
	 * Devuelve una cadena que representa el estado actual de la cuenta. Esa cadena
	 * proporcionará la siguiente información:
	 * <ol>
	 * <li><strong>Identificador</strong> de la cuenta.</li>
	 * <li><strong>Saldo actual</strong> de la cuenta.</li>
	 * <li>Si la cuenta está o no <strong>embargada</strong>.</li>
	 * </ol>
	 * <p>
	 * <strong>El formato de salida</strong> será del siguiente tipo:
	 * </p>
	 * 
	 * <pre>
	 * Id: XXX - Saldo: YYYYYYYY.YY - Embargada: sí|no [ZZZ.Z%]
	 * </pre>
	 * <p>
	 * donde XXX será el identificador de la cuenta(número entero); YYYYYYYY.YY será
	 * el saldo actual en euros, con dos decimales, con una anchura para poder
	 * representar el máximo saldo de 50000000.00 euros; ZZZ.Z será el porcentaje
	 * actual de embargo de la cuenta con una anchura de 5 caracteres, y con un
	 * decimal, si es que está embargada. Si no lo está, no aparecerá información de
	 * porcentaje. Simplemente aparecerá "no".
	 * </p>
	 * <p>
	 * Algunos ejemplos de este <code>String</code> de salida podrían ser:
	 * </p>
	 * 
	 * <pre>
	 * Id: 0 - Saldo: 50000000,00 - Embargada: no
	 * </pre>
	 * 
	 * <pre>
	 * Id: 0 - Saldo:        0,00 - Embargada: no
	 * </pre>
	 * 
	 * <pre>
	 * Id: 0 - Saldo:    -2000,00 - Embargada: no
	 * </pre>
	 * 
	 * <pre>
	 * Id: 1 - Saldo:     5000,00 - Embargada: sí  25,0%
	 * </pre>
	 * 
	 * <pre>
	 * Id: 1 - Saldo:     3750,00 - Embargada: sí  50,0%
	 * </pre>
	 * 
	 * <pre>
	 * Id: 3 - Saldo:        0,00 - Embargada: sí 100,0%
	 * </pre>
	 *
	 * @return Cadena que representa el estado actual de la cuenta.
	 */

}
