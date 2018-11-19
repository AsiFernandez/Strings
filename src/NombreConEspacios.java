import java.util.Scanner;

public class NombreConEspacios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombre = scan.nextLine();
		
		for(int i= 0; i <= nombre.length(); i++) {
			System.out.print(nombre.charAt(i) + " ");
		}

	}

}



