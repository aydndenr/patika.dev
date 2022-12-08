import java.util.Scanner;

public class OddCatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int odd, sum = 0;
		System.out.println("Sayı girmeye başlayın tek girene kadar devam");
		do {
			odd = scan.nextInt();
			System.out.println(odd % 4 == 0 ? odd + " dörde bölündü teprikler " : odd + " dörde bölünmes ");
			sum = odd % 4 == 0 ? (odd + sum) : sum;
			if (odd % 2 != 0) {
				System.out.println("girilen sayı tektir =" + odd);

			}
		} while (odd % 2 == 0);
		System.out.println("işlem bitti toplam= " + sum);

	}

}
