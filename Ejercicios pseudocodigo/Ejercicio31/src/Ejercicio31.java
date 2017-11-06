import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float resultado=0;
		System.out.println("Introduzca uno de los siguientes números:");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicación");
		System.out.println("4 - División");
		Scanner teclado= new Scanner(System.in);
	    int opcion=teclado.nextInt();
	    int comodin=0;
	    while ((opcion<1) || (opcion>4)) {
			System.err.println("Por favor, vuelva a intentarlo");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("3 - Multiplicación");
			System.out.println("4 - División");
			  int opcion2=teclado.nextInt();
			  opcion=opcion2;
		}
	    System.out.println("Meta los 2 numeros con los que desea operar");
	    float a=teclado.nextFloat();//Este va a ser el primero número que metamos por teclado
	    float b=teclado.nextFloat(); //Este va a ser el segundo número que metamos por teclado
	   // while ((opcion>=1)&(opcion<=4))
			switch (opcion + comodin) {//A través de este Switch se hacen las distintas operaciones
			case 1:
				resultado=a+b;
				System.out.print(a+" + "+b+" "+" = "+resultado );
				break;
			case 2:
				resultado=a-b;
				System.out.print(a+" - "+b+" "+" = "+resultado);
				break;
			case 3:
				resultado=a*b;
				System.out.print(a+" * "+b+" "+" = "+resultado);
				break;
			case 4:
				if (b==0) {
					System.err.print("No se puede dividir por 0");
				} else {
					resultado=a/b;
					System.out.print(a+" / "+b+" "+" = "+resultado);
				}
				break;
		}
		teclado.close();
	}

}
