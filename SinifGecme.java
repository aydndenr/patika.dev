import java.util.Scanner;

public class SinifGecme {
	public static void main(String[] args) {
		int matematik, turkce, fizik, kimya, muzik, ort = 0, toplam = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Matematik:");
		matematik = scan.nextInt();
		toplam = (matematik > 0 && matematik < 100) ? toplam + matematik : toplam;
		ort = (matematik > 0 && matematik < 100) ? ort + 1 : ort;
		System.out.println("turkce:");
		turkce = scan.nextInt();
		toplam = (turkce > 0 && turkce < 100) ? toplam + turkce : toplam;
		ort = (turkce > 0 && turkce < 100) ? ort + 1 : ort;
		System.out.println("fizik:");
		fizik = scan.nextInt();
		toplam = (fizik > 0 && fizik < 100) ? toplam + fizik : toplam;
		ort = (fizik > 0 && fizik < 100) ? ort + 1 : ort;
		System.out.println("kimya:");
		kimya = scan.nextInt();
		toplam = (kimya > 0 && kimya < 100) ? toplam + kimya : toplam;
		ort = (kimya > 0 && kimya < 100) ? ort + 1 : ort;
		System.out.println("müzik:");
		muzik = scan.nextInt();
		toplam = (muzik > 0 && muzik < 100) ? toplam + muzik : toplam;
		ort = (muzik > 0 && muzik < 100) ? ort + 1 : ort;
		double sonuc = toplam / ort;

		System.out.println(sonuc > 55 ? "Gecti puan" + sonuc : "kaldı puan " + sonuc);
	}
}