import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado = new Scanner(System.in);
	float entero= teclado.nextInt();
	if (entero>0) {
		System.out.println("El n�mero"+" "+entero+" "+"es positivo" );
	}
	if (entero<0) {
		System.out.println("El n�mero"+" "+entero+" "+"es negativo");
	}
	if (entero==0) {
		System.out.println("El n�mero es"+" "+entero);
	}
	}
}
