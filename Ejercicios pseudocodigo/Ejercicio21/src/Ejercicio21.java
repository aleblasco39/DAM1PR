/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int sumapares=0;
		int sumaimpares=0;
		while (contador<=1000) {
			switch (contador%2) {
			case 0:
				sumapares=sumapares+contador;
				break;
			default:
				sumaimpares=sumaimpares+contador;
				break;
			}
			contador++;
		}
		System.out.println("La suma de números pares será de "+sumapares+" y la de impares será de "+sumaimpares);	}

}
