import java.util.Scanner;

public class Ejercicio2 { // Dada una frase de no m�s de 80 caracteres hacer un programa que busque cu�ntas
	// may�sculas y min�sculas tiene y lo imprima

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un texto de no m�s de 80 car�cteres");
		String texto=teclado.nextLine();
		int comodin=0;
		int contadormayus = 0;
		int conatadorminus = 0;
		while (comodin<1) {
			if (texto.length()>80) {
				System.err.println("Solo se pueden meter frases de menos de 80 car�cteres");
				String texto2=teclado.nextLine();
				texto=texto2;
			} else {
				comodin=1;
			}
		for (int i = 0; i < texto.length(); i++) {
				if("QWERTYUIOPASDFGHJKL�ZXCVBNM�����".indexOf(texto.substring(i, i+1)) !=-1 ) {
					contadormayus++;
				}
				if ("qwertyuiopasdfghjkl�zxcvbnm�����".indexOf(texto.substring(i, i+1)) !=-1) {
					conatadorminus++;
				}
			}
		}
		System.out.println("En el texto hay un total de "+contadormayus+" letras may�sculas y "+conatadorminus+" letras min�sculas");
		teclado.close();	
	}
}