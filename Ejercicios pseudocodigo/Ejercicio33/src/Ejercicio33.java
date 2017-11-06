import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String array[]=new String[20];
		String nombres_personas;
		for (int i = 0; i < array.length; i++) {
			nombres_personas=teclado.nextLine();
			array[i]=nombres_personas;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		teclado.close();
		}

}
