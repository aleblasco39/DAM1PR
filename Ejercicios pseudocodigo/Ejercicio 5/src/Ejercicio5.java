/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int sumaimpares=0;
		while (contador<=100) {
			if (contador%2!=0) {
				System.out.println(contador);
				sumaimpares++;
			}
			contador++;	
		}
		System.out.println("El número de impares será igual a" + " "+ sumaimpares);
	}

}
