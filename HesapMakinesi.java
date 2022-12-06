import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sayi1, sayi2;
		int islem;
		System.out.println("Bir sayı gir");
		sayi1 = scan.nextDouble();
		System.out.println("Bir daha sayı gir");
		sayi2 = scan.nextDouble();
		System.out.println("toplama için 1 çıkarma için 2 çarpma için 3 bölme için 4 yaz");
		islem = scan.nextInt();
		switch (islem) {

		case 1:
			System.out.println("sonuç=" + (sayi1 + sayi2));

			break;

		case 2:
			System.out.println("sonuç=" + (sayi1 - sayi2));
			break;

		case 3:
			System.out.println("sonuç=" + (sayi1 * sayi2));

			break;

		case 4:
			System.out.println("sonuç=" + (sayi1 / sayi2));
			break;
		default:
			System.out.println("hatalı işlem tekrar dene");
		}

	}
}