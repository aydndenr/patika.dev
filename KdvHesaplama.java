import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		double kdv18 = 0.18, tutar, kdv8 = 0.8, kdv;
		Scanner scan = new Scanner(System.in);
		System.out.println("KDV Gelecek Tutar:");
		tutar = scan.nextDouble();
		kdv = (tutar > 1000) ? kdv8 : kdv18;
		System.out.println("Kdv Oranı:" + kdv);
		System.out.println("Kdv Tutarı:" + tutar * kdv);
		System.out.println("Kdv li Tutar:" + (tutar + tutar * kdv));
		System.out.println("Kdv siz Tutar:" + tutar);

	}

}