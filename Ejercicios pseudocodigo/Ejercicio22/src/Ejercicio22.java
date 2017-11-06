import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce texto, por favor");
		String texto=teclado.nextLine();
		String tab=" ";
		int contador=0;
		System.out.println(" ");
		while (contador<=5) {
			System.out.println(tab + texto);
			tab=tab + "\t";
			contador++;
		}
		teclado.close();
	}

}
