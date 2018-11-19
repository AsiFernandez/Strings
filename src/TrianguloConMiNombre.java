import java.util.Scanner;

public class TrianguloConMiNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner(System.in);
		
		String nombre = "";
		System.out.println("introduce tu nombre");
		nombre = Scan.nextLine();
		
		for(int i= 0; i <= nombre.length(); i++) {
			System.out.println(nombre.substring(0, i));
		}
	}

}






