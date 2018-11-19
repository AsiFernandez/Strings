package StringBuilder;

import java.util.Scanner;

public class ConcatenarSaludo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//Pedir Nombre
		System.out.println("Introduce tu nombre");
		String nombreI = scan.nextLine();
		
		String saludo = "Don ";
		
		
		
		//Concatenar "Don" + el nombre introducido (de forma normal)
		StringBuilder nombre = new StringBuilder(nombreI);
		System.out.println("Don " + nombre);
		
		
		
		
		//Stringbuilder concatenar "Don " + el nombre introducido con insert
		
		
		System.out.println(nombre.insert(0, saludo));

	}

}
