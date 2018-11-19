package StringBuilder;

import java.util.Scanner;

public class MayusculaMinuscula {

	public static void main(String[] args) {
		
		
//		System.out.println("introduce tu nombre");
//		String nombre = scan.nextLine().toLowerCase();
//		String nombreC = "";
//		
//		
//		for(int i = 0; i < nombre.length(); i++) {
//		if (i % 2 != 0) {
//            nombreC = nombre[i].toUpperCase();
//        }
//        else {
//            nombreC= nombre[i].toLowerCase();
//         }   
//		}
		
		
		
		
		
		
	Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un nombre : ");
		String nombre = scan.nextLine(); 	
		String palabra="";
		for(int i=0;i<nombre.length();i++)
		{
			char ch=nombre.charAt(i);	

			if(i%2==0)			
			ch=Character.toUpperCase(ch);
			palabra=palabra+ch;	
		}
		System.out.println("Required String : "+palabra);
	}

}
