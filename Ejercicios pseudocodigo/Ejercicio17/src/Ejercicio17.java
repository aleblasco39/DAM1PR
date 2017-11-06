import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int pares=0;
		int suma=0; 
		int a=teclado.nextInt();
		int b=teclado.nextInt();
		while (b<a) {
			System.out.println("Te la batimamaste, mete un número mayor que el otro o tomate un buen vaso de lejía :D");
			int c=teclado.nextInt();
			b=c;
		}
		while (a<=b) {
			if (a%2==0) {
				System.out.println(a);
				suma=suma+a;
				pares++;
			}
			a++;
		}
		System.out.println("La suma de los pares será de"+" "+suma+" "+"y el número de pares será de"+" "+pares);
	}

}
