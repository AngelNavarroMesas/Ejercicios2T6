package ejercicios;

import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		char aux;
		int i=0;
		System.out.println("Introduzca una frase para pasarla a nombre de variable de nomenclatura Camel");
		frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		
		while(i<frase.length()) {
			
			if(frase.charAt(i)==' ') {
				aux = frase.charAt(i+1);
				aux = Character.toUpperCase(aux);
				frase = frase.replace(frase.charAt(i+1), aux);
			}
			i++;
		}
		frase = frase.replaceAll(" ", "");
		
		System.out.println(frase);
	}

}
