import java.util.Scanner;

public class MayusculasElNombre {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("introduce tu nombre como quieras y nosotros lo escribiremos con la primera mayuscula");
		String nombre = scan.nextLine().toLowerCase();
		
		
		
		String bienPuesto = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
		System.out.println(bienPuesto);
	}

}
