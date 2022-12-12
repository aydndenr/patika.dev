import java.util.Scanner;

public class RevTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Üçgen Kaç satırlı olacak?");

		int numb = scan.nextInt();
		for (int i = 0; i < numb; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (numb - i) * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
		for (int i = 1; i <= numb; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (numb - i) * 2 + 1; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

}
