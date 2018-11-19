import java.util.Scanner;

public class NombreComoAsier {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String piter = "piter";
		String nombre = "";
		
			
		do {
			
			System.out.println("Introduce Piter");
			nombre = scan.nextLine();
			
		} while (!nombre.equalsIgnoreCase(piter));
			
		System.out.println("Enhorabuena has puesto bien piter");
	}

}
