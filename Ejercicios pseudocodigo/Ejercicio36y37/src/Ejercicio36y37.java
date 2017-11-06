
public class Ejercicio36y37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 36
		int matriz[][]=new int[4][5];
		for (int filas = 0; filas < 4; filas++) {
			for (int columnas = 0; columnas < 5; columnas++) {
				matriz[filas][columnas]=(int) (Math.random()*100);
				System.out.print(matriz[filas][columnas]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		//Ejercicio 37
		
		for (int columnas = 0; columnas < 5; columnas++) {
			for (int filas = 0; filas < 4; filas++) {
				matriz[filas][columnas]= matriz[columnas][filas];
				System.out.print(matriz[columnas][filas]+" ");
			}
			
		}
	}

}
