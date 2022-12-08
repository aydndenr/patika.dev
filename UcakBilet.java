import java.util.Scanner;

public class UcakBilet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double km, brkm = 0.1, ucret;
		int tip, yas;
		System.out.println("km giriniz");
		km = scan.nextDouble();
		if (km < 0) {
			System.out.println("veri hatalı");
			return;
		}
		System.out.println("yolculuk tipi tek yön 1 gidiş gel 2");
		tip = scan.nextInt();
		if (tip < 1 || tip > 2) {
			System.out.println("veri hatalı");
			return;

		}
		System.out.println("yaşınızı giriniz");
		yas = scan.nextInt();
		if (yas < 0) {
			System.out.println("veri hatalı");
			return;
		}
		if (yas < 13) {
			ucret = km * brkm * 0.8;
		} else if (yas > 12 && yas < 25)

		{
			ucret = km * brkm * 0.9;

		} else if (yas > 64) {
			ucret = km * brkm * 0.7;

		} else
			ucret = km * brkm;

		if (tip == 2)
			ucret = (ucret * 0.8) * 2;

		System.out.println("ücret = " + ucret + "   tl");
	}

}
