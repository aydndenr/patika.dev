import java.util.Scanner;

public class NumberPattern {
	static void patt(int a, int b) {

		if (a > 0) {
			System.out.print(a+" ");		
			patt(a - 5, b);

		} else 
			patt2(a,b);
	
	
	}
	static void patt2(int a, int b) {

		if (a <=b) {
			System.out.print(a+" " );
		patt2(a + 5, b);}
		else 
			System.out.println(" bitiş");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("sayı= ");
		int a = scan.nextInt();
		patt(a , a);
	}

}
