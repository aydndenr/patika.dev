import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int numb = scan.nextInt();
		int sum = 0;
		for (int i = 1; i < numb; i++) {
			if (numb % i == 0)
				sum = sum + i;

		}
		System.out.println(sum == numb ? numb + " bir mükemmel sayıdır" : numb + " mükemmel sayı değildir");
	}

}
