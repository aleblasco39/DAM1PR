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
		String mitexto = teclado.nextLine();
		while (contador < mitexto.length()) {
			posicion =  mitexto.substring(contador, mitexto.length());
			System.out.println(posicion);
			contador++;
		}
		teclado.close();
		}

}
