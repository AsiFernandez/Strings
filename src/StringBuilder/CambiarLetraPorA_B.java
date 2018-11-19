package StringBuilder;

import java.util.Scanner;

public class CambiarLetraPorA_B {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombreI = scan.nextLine().toLowerCase();
		
		
		StringBuilder nombre = new StringBuilder(nombreI);
		
		if(nombre.charAt(0) == 'a'){
			nombre.setCharAt(0, 'B');
			System.out.println(nombre);
		}else {
			nombre.setCharAt(0, 'A');
			System.out.println(nombre);
		}
		
		
		
		
	}

}
