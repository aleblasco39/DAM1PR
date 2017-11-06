import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String texto1 = teclado.nextLine();
		
		if (texto1.equals("S") || texto1.equals("N")) {
			System.out.println("CE MAMO");
			}
		
		else {
			System.out.println("Haz algo con tu vida e introduce solo S o N");
			String texto2=teclado.nextLine();
			texto1=texto2;
		} 
		teclado.close();	
		}
		
	}


