import java.util.Scanner;

public class NombreAlReves {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre y lo escribire del reves");
		String nombre = Scan.nextLine();
		
		String delReves = "";
		
		
		for(int i = nombre.length(); i >= 0; i--) {
			delReves = delReves + nombre.charAt(i);
		}
		
		System.out.println(delReves);
	}

}
