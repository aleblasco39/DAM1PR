import java.util.Vector;

public class Ejercicio1 {

	public static void main(String[] args) {// Se generan 20 n�meros aleatorios de tipo entero entre -10 y 10 almacen�ndolos en un vector.
		// Hay que calcular y mostrar la media y, adem�s, mostrar cu�ntos n�meros hay:
		//	-Superiores a la media
		//	-Inferiores a la media
		//	-Iguales a la media
		// TODO Auto-generated method stub
		int lista[]=new int [20];
		int sup=0;//contador para los mayores de la media
		int inf=0;//contador para los menores de la media
		int med=0;//contador para los iguales a la media
		int media=0;
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*20)-10;
			media=lista[i]+media;
		}
		media=media/20;
		System.out.println("Esta es la media "+media);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Numeros que son superiores, inferiores e iguales:");
		for (int i = 0; i < lista.length; i++) {
			if (lista[i]>media) {
				System.out.println(lista[i]+" Inferior a la media");
				sup++;
			}
			if (lista[i]<media) {
				System.out.println(lista[i]+" Superior a la media");
				inf++;
			}
			if (lista[i]==media) {
				System.out.println(lista[i]+" Igual a la media");	
				med++;
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("El numero de numeros iguales a la media es de "+med+", los numeros inferiores a la media es de "+inf+" y los n�meros superiores a la media es de "+sup);
	}

}
