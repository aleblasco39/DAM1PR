import java.util.Scanner;

public class Ejercicio7 { // Leer una frase por teclado y escribir a continuaci�n cuantas may�sculas, min�sculas y
	//n�meros contiene.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int mayus=0; int minus=0; int num=0;
		String mayusculas="QWERTYUIOPASDFGHJKL�ZXCVBNM�����"; 
		String minusculas="qwertyuiopasdfghjkl�zxcvbnm�����";
		String numeros="0123456789";
		System.out.println("Introduzca una frase");
		String frase=teclado.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			if (mayusculas.indexOf(frase.substring(i, i+1)) !=-1) {
				mayus++;
			}
		if (minusculas.indexOf(frase.substring(i, i+1))!=-1){
			minus++;
		}
		if (numeros.indexOf(frase.substring(i, i+1)) !=-1) {
			num++;
		}
		}
		System.out.println(frase);
		System.out.println("En la siguiente frase hay "+mayus+" letras may�sculas, "+minus+" letras min�sculas y "+num+" n�meros");
		teclado.close();
	}

}
