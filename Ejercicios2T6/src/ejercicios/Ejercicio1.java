package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux="" ,frase = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		int i=0;
		
		while(i<frase.length()) {
			aux="";
			if(frase.indexOf("/*")>0&&frase.indexOf("*/")>0) {
				aux=frase.substring(frase.indexOf("/*")-1, frase.indexOf("*/")+2);
				frase = frase.replace(aux, "");
			}
			i++;
		}
		
		System.out.println(frase);
		
	}

}
