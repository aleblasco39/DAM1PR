import java.util.Scanner;

public class Ejercicio8 { // Leer una frase filtr�ndola a que todos sus caracteres sean may�sculas, una vez filtrada y
	// dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del
	// modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada
	// car�cter se transforme en 3 c�digos ASCII mas es decir :
	// Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
	// Desarrollar los programas de codificar y descodificar mediante dos funciones.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String letras="ABCDEFGHIJKLMN�OPQRSTUWXYZABCDEFGHIJ";
		String codificado="";
		System.out.println("Introduzca una frase");
		String mitexto=teclado.nextLine();
		System.out.println("Introduzca los espacios de corrido");
		int corrido=teclado.nextInt();
		while ((corrido<1) || (corrido>10)) {
			System.err.println("Solo se puede escoger entre 1 corrido y 10 corridos");
			int corrido2=teclado.nextInt();
			corrido=corrido2;
		}
		String mitexto2;
		mitexto=mitexto.toUpperCase();
		mitexto2=mitexto;
		for (int i = 0; i < mitexto.length(); i++) {
			int posicion=letras.indexOf(mitexto.substring(i, i+1));
				codificado=codificado.concat(letras.substring(posicion+corrido,posicion+corrido+1));

		}
		System.out.println(codificado);
		System.out.println("�Desea descodificarlo?");
		System.out.println("Introduzca 1 para Si");
		System.out.println("Introduzca 2 para No");;
		int opcion=teclado.nextInt();
		if ((opcion<1) || (opcion>2)) {
			System.err.println("Solo se puede escoger entre 1 o 2");
			int opcion2=teclado.nextInt();
			opcion=opcion2;
		}
		switch (opcion) {
		case 1:
			System.out.println(mitexto);
			break;
		case 2:
			System.out.println(" ");
			break;
		}
		teclado.close();
		}
		

}
