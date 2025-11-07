/*
 * Nombre: Firdaus Abouhafsse
 * Fecha:21/10/2025
 * Descripción: Realizar un cuestionario y sumar un punto cada pregunta acertada.
 */


package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char respuesta;
		int nota=0;
		
		//1.
		System.out.print("1.¿Cuál de las siguientes partes NO forma parte del hardware de un sistema informático?");
		System.out.println("\na)La memoria RAM\nb)El sistema operativo\nc)El procesador\nd)El disco duro");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='b') {
			nota++;
		}
		System.out.println("\n");
		
		//2.
		System.out.print("2.¿Qué tipo de software se encarga de gestionar los recursos del ordenador y servir de intermediario entre el hardware y el usuario?");
		System.out.println("\na)Software de aplicación\nb)Software de desarrollo\nc)Software de sistema\nd)Firmware");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='c') {
			nota++;
		}
		System.out.println("\n");
		
		//3.
		System.out.print("3. ¿Cuál de los siguientes sistemas de archivos es propio de Linux?");
		System.out.println("\na)NTFS\nb)FAT32\nc)ext4\nd)HFS+");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='c') {
			nota++;
		}
		System.out.println("\n");
		
		//4.
		System.out.print("4. ¿Qué componente del hardware realiza las operaciones aritméticas y lógicas?");
		System.out.println("\na)La memoria principal\nb)El bus de datos\nc)La ALU (Unidad Aritmético-Lógica)\nd)La GPU");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='c') {
			nota++;
		}
		System.out.println("\n");
		
		//5.
		System.out.print("5. ¿Cuál de los siguientes comandos de Linux sirve para cambiar los permisos de un archivo?");
		System.out.println("\na)ls\nb)chmod\nc)cp\nd)mv");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='b') {
			nota++;
		}
		System.out.println("\n");
		
		
		//6.
		System.out.print("6.¿Qué dirección IP pertenece a una red privada según las normas de direccionamiento IPv4?");
		System.out.println("\na)8.8.8.8\nb)172.20.15.2\nc)192.0.2.1\nd)198.51.100.3");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='b') {
			nota++;
		}
		System.out.println("\n");
		
		//7.
		System.out.print("7. ¿Qué tecnología se utiliza para virtualizar sistemas operativos en un mismo equipo físico?");
		System.out.println("\na)RAID\nb)DHCP\nc)Hypervisor\nd)DNS");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='c') {
			nota++;
		}
		System.out.println("\n");
		
		//8.
		System.out.print("8. ¿Qué protocolo se utiliza para transferir archivos de forma segura entre equipos?");
		System.out.println("\na)FTP\nb)SFTP\nc)SMTP\nd)SNMP");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='b') {
			nota++;
		}
		System.out.println("\n");
		
		//9.
		System.out.print("9. ¿Qué elemento del sistema operativo es responsable de planificar y asignar tiempo de CPU a los procesos?");
		System.out.println("\na)El gestor de archivos\nb)El planificador de procesos\nc)El intérprete de comandos\nd)El gestor de memoria");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='b') {
			nota++;
		}
		System.out.println("\n");
		
		//10.
		System.out.print("10. ¿Cuál es la finalidad de un sistema RAID?");
		System.out.println("\na)Mejorar el rendimiento gráfico\nb)Aumentar la seguridad de red\nc)Incrementar la redundancia y/o velocidad en el almacenamiento\nd)Controlar los accesos de usuario");
		
		System.out.print("\nRespuesta: ");
		respuesta=scanner.nextLine().charAt(0);
		
		if(respuesta=='c') {
			nota++;
		}
		System.out.println("\n");
		
		//Nota
		System.out.println("Tu nota es: "+nota);

	}

}
