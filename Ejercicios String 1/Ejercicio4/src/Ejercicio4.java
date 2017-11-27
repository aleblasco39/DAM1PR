import java.util.Scanner;

public class Ejercicio4 { // Leer una cadena de hasta 80 caracteres y pasarla en funci�n de una variable de opci�n a
	// may�sculas � a min�sculas e imprimir la cadena resultante

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca una frase de menos de 80 car�cteres");
		String frase=teclado.nextLine();
		int comodin=0;
		System.out.println("Menu de operaciones");
		System.out.println("1 - Convierte la frase en may�suclas");
		System.out.println("2 - Convierte la frase en min�sculas");
		int opcion=teclado.nextInt();
		while (comodin<1) {
			if (frase.length()>80) {
				System.err.println("Por favor, solo se admiten frases de 80 car�cteres");
				String frase2=teclado.nextLine();
				frase=frase2;
			} else {
				comodin=1;
			}
			while (comodin<2) {
				if ((opcion<1) || (opcion>2)) {
					System.err.println("Solo se puede escoger o 1 o 2");
					int opcion2=teclado.nextInt();
					opcion=opcion2;
				} else {
					comodin=2;
				}
			}
			switch (opcion) {
			case 1:
				frase= frase.toUpperCase();
				System.out.println(frase);
				break;
			case 2:
				frase=frase.toLowerCase();
				System.out.println(frase);
				break;
			}
		}
		teclado.close();
	}

}


