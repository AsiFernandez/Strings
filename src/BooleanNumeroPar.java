import java.util.Scanner;

public class BooleanNumeroPar {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario un número entero y, si es par, dé el valor "true" a una variable booleana 
		//llamada "esPar"; es caso contrario, le dará el valor "false".

		
		Scanner Scan = new Scanner(System.in);
		
		int numero;
		boolean esPar = true ;
		
		System.out.println("introduce el numero para saber si es par");
		numero = Scan.nextInt();
		
		
		if(numero % 2 == 0) {
			System.out.println(esPar);
		}else {
			esPar = false;
			System.out.println(esPar);
		}
		
	}

}
