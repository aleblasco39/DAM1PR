import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x=teclado.nextInt();
		int menor=x; 
		int mayor=x;
		int contador=1;
		while (contador<=4) {
			int x2=teclado.nextInt();
			if (x2<menor) {
				menor=x2;
			}
			if (x2>mayor){
				mayor=x2;
			}
			contador++;
		}
		teclado.close();
		System.out.println("El número más grande será"+" "+mayor);
		System.out.println("El número más pequeño será"+" "+menor);
	}

}
