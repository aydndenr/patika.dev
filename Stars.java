import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
System.out.println("sayı giriniz");
		int a = scan.nextInt();
		for (int j = 0; j <= a; j++) {

			for (int i = 0; i < a-j; i++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= (j * 2 + 1); k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
			
		}
		for (int j = 0; j <= a; j++) {

			for (int i = 0; i <= j; i++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= ((a-j) * 2 - 1); k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
			
		}
		
		
		
		
		
		
		
	}
}
