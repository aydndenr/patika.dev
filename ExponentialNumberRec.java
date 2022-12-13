import java.util.Scanner;

public class ExponentialNumberRec {
	static int exp(int a, int b) {

		if (b == 0)
			return 1;
		else {
			return (a * exp(a, b - 1));

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("üssü alınacak sayı= ");
		int a = scan.nextInt();
		System.out.println("üs değeri= ?");
		int b = scan.nextInt();
		System.out.println(exp(a, b));
	}

}
