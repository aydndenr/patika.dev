import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double armut = 2.14, elma = 3.67, domates = 1.11, patlican = 5.00, muz = 0.95, tutar;
		Scanner scan = new Scanner(System.in);
		System.out.println("Armut Kaç kilo=");
		tutar = armut * scan.nextDouble();
		System.out.println("Elma Kaç kilo=");
		tutar = tutar + (elma * scan.nextDouble());
		System.out.println("Domates Kaç kilo=");
		tutar = tutar + (domates * scan.nextDouble());
		System.out.println("Patlıcan Kaç kilo=");
		tutar = tutar + (patlican * scan.nextDouble());
		System.out.println("Muz Kaç kilo=");
		tutar = tutar + (muz * scan.nextDouble());
		System.out.println("Toplam Tutar= " + tutar);

	}

}
