import java.util.Scanner;

public class Ejercicio5 { //Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas de forma que una
	// contenga los caracteres en posición par y la otra los caracteres en posición impar.

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca una frase de menos de 80 carácteres");
		String frase=teclado.nextLine();
		int comodin=0;
		while (comodin<1) {
			if (frase.length()>80) {
				System.err.println("Por favor, solo se admiten frases de 80 carácteres");
				String frase2=teclado.nextLine();
				frase=frase2;
			} else {
				comodin=1;
			}
		}
		System.out.println("Par"+"\t"+"Impar");
		for (int i = 0; i < frase.length(); i++) {
			if (i%2==0) {
				System.out.println(frase.substring(i, i+1));
				} else {
				System.out.println("\t"+frase.substring(i, i+1));
			}
			
		}
		teclado.close();
	}
}
