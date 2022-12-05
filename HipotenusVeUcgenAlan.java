import java.util.Scanner;

public class HipotenusVeUcgenAlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, d, e, f;
		double c, g;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. kenar= ");

		a = scan.nextInt();
		System.out.println("2. kenar= ");
		b = scan.nextInt();

		c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		System.out.println("hipotenüs=" + c);

		System.out.println("1. kenar= ");
		d = scan.nextInt();

		System.out.println("2. kenar= ");
		e = scan.nextInt();

		System.out.println("3. kenar= ");

		f = scan.nextInt();
		
		g=(d+e+f)/2;
		
		System.out.println("Üçgenin Alanı="+Math.sqrt(g*(g-d)*(g-e)*(g-f)));
	}

}
