import java.util.Scanner;

public class HipotenusVeUcgenAlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aKenar, bKenar, dKenar, eKenar, fKenar;
		double cHip, gCev;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. kenar= ");

		aKenar = scan.nextInt();
		System.out.println("2. kenar= ");
		bKenar = scan.nextInt();

		cHip = Math.sqrt((Math.pow(aKenar, 2) + Math.pow(bKenar, 2)));
		System.out.println("hipotenüs=" + cHip);

		System.out.println("1. kenar= ");
		dKenar = scan.nextInt();

		System.out.println("2. kenar= ");
		eKenar = scan.nextInt();

		System.out.println("3. kenar= ");

		fKenar = scan.nextInt();
		
		gCev=(dKenar+eKenar+fKenar)/2;
		
		System.out.println("Üçgenin Alanı="+Math.sqrt(gCev*(gCev-dKenar)*(gCev-eKenar)*(gCev-fKenar)));
	}

}
