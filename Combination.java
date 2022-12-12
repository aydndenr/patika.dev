import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n, r, solution1=1,solution2=1,solution3=1,solution;
		System.out.println("kombinasyon C(n,r) için n değeri giriniz");
		n = scan.nextInt();
		System.out.println("kombinasyon C(n,r) için r değeri giriniz");
		r = scan.nextInt();

		for (int i = 1; i <= n; i++) 
		{
			solution1 *= i;
		}
		for (int j = 1; j <= r; j++) 
		{
			solution2 *= j;	
		}
		for (int k = 1; k <= (n - r); k++) 
		{
			solution3 *= k;
		}
	solution=	solution1/(solution2*solution3);
	System.out.println("sonuç= "+solution);
	}

}
