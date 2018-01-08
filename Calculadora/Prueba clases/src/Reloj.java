import java.util.Scanner;

public class Reloj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int segundo, minuto, hora;
		System.out.println("Dame la hora ");
		hora = teclado.nextInt();
		System.out.println("Dame los minutos");
		minuto = teclado.nextInt();
		System.out.println("Dame los segundos");
		segundo = teclado.nextInt();
		Hora mihora=new Hora(hora, minuto, segundo);
		System.out.println(mihora);
		System.out.println(mihora.getHora()+":"+mihora.getMinuto()+":"+mihora.getSegundo());
		System.out.println(" "+mihora.toString());
		}

}
