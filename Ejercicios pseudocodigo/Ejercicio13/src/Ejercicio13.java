/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=1;
		int np2=0;
		int np3=0;
		while (contador<=100) {
			if (contador%2==0) {
				System.out.println(contador);
				np2++;
			}		
			if (contador%3==0) {
				System.out.println(contador);
				np3++;
			}
			contador++;
		}
		System.out.println("El número de multiplos pares de 2 será de"+" "+np2+" "+"y el de multiplos de 3 será de"+" "+np3);
	}

}
