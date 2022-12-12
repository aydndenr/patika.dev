import java.util.Scanner;

public class PrimeNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Program çalıştı");

		System.out.print(2 + "");

		for (int i = 2; i < 101; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					break;

				} else if (j == i - 1)
					System.out.print(" " + i);
				else
					continue;

			}

		}

	}

}
