import java.util.Scanner;

public class Nnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numb1, numb2 = 0, numb3 = 0, changes;
		System.out.println("KAÇ SAYI GİRİLECEKTİR?= ");
		changes = scan.nextInt();
		if (changes < 1) {
			System.out.println("böyle bir işlem yapılamas");
			return;
		}
		while (changes > 0) {

			System.out.println("SAYI GİRİNİZ ?= ");
			numb1 = scan.nextInt();
			if (changes < 2) {
				System.out.println(changes < 2 ? "tek sayı girildiğinden en küçük ve enbüyük sayıdır  " + numb1
						: " burada olmaması gerekir?");
				return;
			}
			--changes;
			if (numb1 > numb3)
				numb3 = numb1;
			else if (numb1 < numb2)
				numb2 = numb1;
			else
				continue;
		}
		System.out.println("en büyük sayı =" + numb3);
		System.out.println("en küçük sayı =" + numb2);
	}

}
