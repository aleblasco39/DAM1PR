

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=0;
		int A=0;
		while (X==A) {
			int tirada= (int) (Math.random()+0.5);
			if (tirada==0) {
				System.out.println("Ha salido cara "+tirada);
			}
			else {
				System.out.println("Ha salido cruz "+tirada);
			}
		}

	}

}
