import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		float media=0;
		int alumno[]=new int[10];//array con el que vamos metiendo la nota
		int suma=0;
		for (int i = 0; i < alumno.length; i++) {
			alumno[i]=teclado.nextInt();
			suma=suma+alumno[i];
		}
		media=suma/alumno.length;
		System.out.println("La nota media de la clase será de "+media);
		teclado.close();
	}

}
