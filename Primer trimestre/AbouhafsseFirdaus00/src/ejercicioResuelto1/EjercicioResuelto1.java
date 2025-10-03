package ejercicioResuelto1;

public class EjercicioResuelto1 {
	
	public enum PalosEnum{OROS, COPAS, BASTO, ESPADAS}

	public static void main(String[] args) {
		
		PalosEnum palo;	
		
		System.out.println("PALOS DE LA BARAJA ESPAÑOLA");
		System.out.println("----------------------------");
		
		palo=PalosEnum.OROS;
		System.out.println("Palo 1: "+palo);
		
		palo=PalosEnum.COPAS;
		System.out.println("Palo 2: "+palo);

		palo=PalosEnum.BASTO;
		System.out.println("Palo 3: "+palo);

		palo=PalosEnum.ESPADAS;
		System.out.println("Palo 4	: "+palo);
		

	}

}
