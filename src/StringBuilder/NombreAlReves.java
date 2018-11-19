package StringBuilder;

import java.util.Scanner;

public class NombreAlReves {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombreI = scan.nextLine();
		
		StringBuilder nombre = new StringBuilder(nombreI);
		
		nombre.reverse();
		System.out.println(nombre);

	}

}
