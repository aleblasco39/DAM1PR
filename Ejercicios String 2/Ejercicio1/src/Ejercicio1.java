import java.util.Scanner;

public class Ejercicio1 { // Escribir un programa que pida por teclado una cadena y una letra, de manera que
	// ponga en may�sculas cada ocurrencia de la letra que haya en la cadena y lo
	// muestre por pantalla.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Inserte una frase");
		String frase=teclado.nextLine();
		System.out.println("Inserte una letra en min�scula");
		String letra=teclado.nextLine();
		frase=frase.replaceAll(letra, letra.toUpperCase());
		System.out.println(frase);
		teclado.close();
	}

}
