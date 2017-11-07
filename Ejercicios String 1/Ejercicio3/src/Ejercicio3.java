import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escriba una frase");
		String frase=teclado.nextLine();
		System.out.println("Introduzca una letra a buscar");
		String letra=teclado.nextLine();
		int posicion=0;
		for (int i = 0; i < frase.length(); i++) {
		 if (frase.indexOf(letra) !=-1) {
			posicion=i+posicion;
			System.out.println("La palabra que buscas está en la posición "+posicion);
		} else {
			System.err.println("La palabra que buscas no está");
		}	
		 frase = frase.substring(posicion, i+1);
		}
		teclado.close();
	}

}
