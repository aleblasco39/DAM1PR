import java.util.Scanner;

public class Ejercicio2 {// Escribe un programa que pida por teclado una cadena y una letra, de manera que
	// elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
	// por pantalla.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Inserte una frase");
		String frase=teclado.nextLine();
		System.out.println("Inserte una letra en minúscula");
		String letra=teclado.nextLine();
		int bucle=0;
		while (bucle<3) {
			frase=frase.replaceFirst(letra, " ");
			bucle++;
		}
		System.out.println(frase);
		teclado.close();
	}
}