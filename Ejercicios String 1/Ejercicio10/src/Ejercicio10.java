import java.util.Scanner;

public class Ejercicio10 {// Escribir un programa que lea una frase (m�ximo 60 caracteres) y diga cu�ntas letras
	// distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras
	// debemos trabajar solo con may�sculas.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int matriz[] = new int [27];
		int caracesp = 0;
		int comodin = 0;
		String texto = teclado.nextLine(); //nuestra frase
		String letras="ABCDEFGHIJKLMN�OPQRSTUWXYZ";
		while (comodin<1) { //As� controlamos que no sea m�s de 60 car�cteres
			if (60<texto.length()) {
				String texto2 = teclado.nextLine();
				texto = texto2;
			}
			else {
				comodin=1;
			}
		}
		texto=texto.toUpperCase();
		for (int i = 0; i < texto.length(); i++) {
			if (letras.indexOf(texto.substring(i, i+1))!=-1) {
				comodin = letras.indexOf(texto.substring(i, i+1));
				matriz[comodin] = matriz[comodin]+1;
			}
			else {
				caracesp++;
			}
		}
		String comodin2 ="";
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i]!=0){	
				comodin2 = letras.substring(i,i+1);
				System.out.println("Hay "+matriz[i]+" "+comodin2);
			}
		}
		System.out.println("Hay "+caracesp+" de caracteres especiales");
		teclado.close();
	}
}
