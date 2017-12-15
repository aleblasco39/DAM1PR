import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		System.out.println("Meta un comprendido entre el 0 y el 10 por favor");
		int numero=teclado.nextInt();
		int contador=0;
		int a=0;
		while ((numero<0)|(numero>10)) {
			System.out.println("Meta un numero comprendido entre el 0 y el 10 por favor");
			int numero2=teclado.nextInt();
			numero=numero2;
		}
		while (contador<=10) {
			a=numero*contador;
			System.out.println(numero+" * "+ contador+" = "+a);	
			contador++;	
		}	
		teclado.close();
	}
}
