import java.util.Scanner;

public class Ejercicio6 { // Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales,
	// consonantes y caracteres numéricos posee.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int voc=0; int cons=0; int num=0; //Los contadores para cada uno de los Strings(voc para las vocales, cons para las consonates y num para los carácteres numéricos
		String vocales="AEIOUaeiouÁÉÍÓÚáéíóú"; //String de las vocales incluyendo las tildes
		String consonantes="QWRTYPSDFGHJKLÑZXCVBNMqwrtypsdfghjklñzxcvbnm"; //String de las consonantes
		String numeros="0123456789";//String de los carácteres numéricos
		System.out.println("Introduzca una frase de no más de 80 carácteres");
		String frase=teclado.nextLine();
		int comodin=0;
		while (comodin<1) {
			if (frase.length()>80) {
				System.err.println("Por favor, solo se admiten frases de 80 carácteres");
				String frase2=teclado.nextLine();
				frase=frase2;
			} else {
				comodin=1;
			}
		}
		for (int i = 0; i < frase.length(); i++) {
			if (vocales.indexOf(frase.substring(i, i+1)) !=-1) {
				voc++;
			}
		if (consonantes.indexOf(frase.substring(i, i+1))!=-1){
			cons++;
		}
		if (numeros.indexOf(frase.substring(i, i+1)) !=-1) {
			num++;
		}
		}
		System.out.println(frase);
		System.out.println("En esta frase hay "+voc+" vocales, "+cons+" consonantes y "+num+" carácteres numéricos");
		teclado.close();
	}

}
