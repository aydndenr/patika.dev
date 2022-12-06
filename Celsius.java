import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double heat;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Sıcaklık Değeri Nedir=?");
		heat = scan.nextDouble();

		if (heat <= 5) {
			System.out.println("kayak yap");
		} else if (heat > 5 && heat <15) {
			System.out.println("sinemaya git");
		}
		else if (heat >= 15 && heat < 25) {
			System.out.println("pikniğe git");
		} else
			System.out.println("yüzmeye git");
	}

}
