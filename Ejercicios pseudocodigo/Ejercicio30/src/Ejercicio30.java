
public class Ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vuelta=0;
		System.out.println("C1");
		System.out.println("C2");
		while (vuelta<=5) {
			int caballo=(int) (Math.random()+0.5);
			if (caballo==0) {
				System.out.print("C1 ");
			}
			else {
				System.out.print("C2 ");
			}
			System.out.println(" ");
			System.out.println(" ");
			vuelta++;

		}
	}
}