import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio1 { //Queremos que imprima una frase que introducimos por teclado pero que a cada impresi�n sea un caracter de la frase y por cada impresi�n sea un salto de l�nea

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		String posicion;
		String frase = teclado.nextLine();
		int comodin=0;
		while (comodin<1) {
			if (frase.length()>80) {
				System.err.println("Por favor, solo se admiten frases de 80 car�cteres");
				String frase2=teclado.nextLine();
				frase=frase2;
			} else {
				comodin=1;
			}
		}
		while (contador < frase.length()) {
			posicion =  frase.substring(contador, frase.length());
			System.out.println(posicion);
			contador++;
		}
		teclado.close();
		}

}
