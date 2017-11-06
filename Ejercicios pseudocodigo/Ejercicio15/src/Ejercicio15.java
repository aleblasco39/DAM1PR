import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n1=teclado.nextInt();
		int mayor=n1; 
		int menor=n1;
		int sumaimpares=0;
		int pares=0;
		int contador=0;
		int n2=teclado.nextInt();
		if (n2>n1) {
			mayor=n2;
		}
		else {
			menor=n2;
		}
		while (menor<mayor) {
			System.out.println(menor);
			if (menor%2==0) {
				pares++;
			} else {
				sumaimpares=sumaimpares+menor;
			}
			contador++;
			menor++;
		}
		System.out.println("Hay"+" "+contador+" "+"entre el primer y el segundo númeo");
		System.out.println("La suma de los números impares será de"+" "+sumaimpares);
		System.out.println("Hay"+" "+pares+" "+"entre el primer y segundo número1");
	}	
}
