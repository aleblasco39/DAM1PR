import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un número por favor");
		int numero=teclado.nextInt();
		int contador=0;
		int a=2;
		System.out.println(" ");
		//Esto es para hallar si el numero que metemos es primo o no
		while (a!=numero) {
			if (numero%a==0) {
				contador++;
			}
			a++;
		}
		if (contador==0) {
			System.out.println("El numero "+numero+" es primo");
		} else {
			System.out.println("El numero "+numero+" no es primo");
		}
		// Esto es para la tabla de multiplicar
		System.out.println(" ");
		System.out.println("La tabla de multiplicar del "+ numero+" será de:");
		a=0;
		contador=0;
		while (contador<=10) {
			a=contador*numero;
			System.out.println(numero+"x"+ contador+"="+a);
			a=0; //Aquí se resetea el valor de a para que se puedan hacer las tablas bien
			contador++;
			System.out.println(" ");
		}	
		//Esto de aquí es para hallar el factorial
		a=1;
		contador=1;
		while (numero>=a) {
			contador=a*contador;
			a++;	
		}
		System.out.println("El factorial de "+numero+" será de "+contador);
		teclado.close();
	}
}
