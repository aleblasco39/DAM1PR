/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Ejercicio29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int suma10=0;
		while (x<=100) {
			int a= (int) (Math.random()*6+1);
			int b= (int) (Math.random()*6+1);
			int comodin=a+b;
			if (comodin==10) {
				System.out.println("Tirada numero "+x+" "+a+" + "+b+" = "+ comodin+" ESTA TIRADA HA SIDO DE 10");//Esto es para mostrar las tiradas en las que ha caido un 10
				suma10++;
			}
			else {
				System.out.println("Tirada numero "+x+" "+a+" + "+b+" = "+ comodin);//De esta manera mostramos todos los lanzamientos
			}
			x++;
		}
		System.out.println("El número de veces que los 2 dados han sumado 10 ha sido de "+suma10);
	}

}
