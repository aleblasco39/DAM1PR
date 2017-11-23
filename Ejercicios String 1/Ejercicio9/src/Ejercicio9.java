import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int contador = 0;
		int mujeres1 = 0; //contador de mujeres en 1er curso
		int mujeres2 = 0; //contador de mujeres en 2do curso
		int hombres1 = 0; //contador de hombres en 1er curso
		int hombres2 = 0; //contador de los hombres en 2do curso
		int contcodi = 0; //contador de cuantos codigos se han metido de manera correcta
		while (contador<6) {
			System.out.println("Introduzca año");
			int año=teclado.nextInt();
			if ((año<1990) || (año>1995)) { // Para que detecte los años de manera correcta
				System.err.println("Solo se pueden años compredidos entre 1990 y 1995");
				int año2= teclado.nextInt();
				año=año2;
			}
			System.out.println("Introduzca M o F"); //Para que detecte el sexo de manera correcta
			String vacio=teclado.nextLine();
			String sexo=teclado.nextLine();
			sexo=sexo.toUpperCase();
			if ((sexo.equals("M") || sexo.equals("F")) == false) {
				System.err.println("Solo se puede M o F");
				String sexo2=teclado.nextLine();
				sexo2=sexo2.toUpperCase();
				sexo=sexo2;
			}
			System.out.println("Introduzca curso:");
			System.out.println("1 - Primer curso");
			System.out.println("2 - Segundo curso");
			int curso=teclado.nextInt();
			if ((curso<1) || (curso>2)) { //Para que detecte los cursos de manera correcta
				System.err.println("Solo se puede o primer curso o segundo");
				int curso2 = teclado.nextInt();
				curso=curso2;
			}
			int random = (int) ((Math.random()*100)-1); //Los 2 últimos digitos se generan de manera aleatoria
			String codigo=año+sexo+curso+random;
			System.out.println(año+sexo+curso+random);
			if (("M1".equals(codigo.substring(4, 6)) == true)) {
				hombres1++;
			}
			if (("M2".equals(codigo.substring(4, 6)) == true)) {
				hombres2++;
			}
			if (("F1".equals(codigo.substring(4, 6)) == true)) {
				mujeres1++;
			}
			if (("F2".equals(codigo.substring(4, 6)) == true)) {
				mujeres2++;
			}

			System.out.println("¿Desea acabar el programa?");
			System.out.println("Si - teclee 00000000");
			System.out.println("No - teclee cualquier otra cosa");
			int fin=teclado.nextInt();
			if (fin == 00000000) {
				System.out.println("El número de hombres es de "+hombres1+" en el primer curso y de "+hombres2+" en el segundo curso");
				System.out.println("El número de mujeres es de "+mujeres1+" en el primer curso y de "+mujeres2+" en el segundo curso");
				System.out.println("Fin");
				contador=6;
			}
			contador++;
		}
		if (contador==6) {
			System.out.println("El número de hombres es de "+hombres1+" en el primer curso y de "+hombres2+" en el segundo curso");
			System.out.println("El número de mujeres es de "+mujeres1+" en el primer curso y de "+mujeres2+" en el segundo curso");
			System.out.println("Fin");
		}
		teclado.close();
	}


}


