import java.util.Scanner;

public class ExponentialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int a, b, sum = 1;
		System.out.println("hesaplanacak sayı?= " );

		a = scan.nextInt();
		System.out.println("üs değer " );

		b = scan.nextInt();
		for (int i = 1; i <= b; i++) {
			sum *= a;
		}
		System.out.println("sonuc?= " + sum);
	}

}
