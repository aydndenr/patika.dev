import java.util.Scanner;

public class HarmonicNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("sayı giriniz");
		double a,solution=0.0;
		a = scan.nextDouble();
		for(double i = 1.0; i<=a;i++) {
			
			solution+=(1.0/i);
		}
			
		System.out.println("sonuç= "+ solution);
			
	}

}
