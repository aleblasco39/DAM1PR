import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca a�o");
		int a�o=teclado.nextInt();
		if ((a�o<1990) || (a�o>1995)) { // Para que detecte los a�os de manera correcta
			System.err.println("Solo se pueden a�os compredidos entre 1990 y 1995");
			int a�o2= teclado.nextInt();
			a�o=a�o2;
		}
		System.out.println("Introduzca M o F");
		String vacio=teclado.next();
		String sexo=teclado.nextLine();
		sexo=sexo.toUpperCase();
		if ((sexo.equals("M") || sexo.equals("F")) == false) {
			System.err.println("Solo se puede M o F");
			String sexo2=teclado.nextLine();
			sexo2=sexo2.toUpperCase();
			sexo=sexo2;
		}
	}

}
