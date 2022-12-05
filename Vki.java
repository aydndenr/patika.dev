import java.util.Scanner;

public class Vki {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		double boy,kilo;
		
	System.out.println("Boyunuzu giriniz mt=");
	boy=scan.nextDouble();
	
	System.out.println("Kilonuzu giriniz kg=");
	kilo=scan.nextDouble();

	
		System.out.println("VKİ= "+kilo/Math.pow(boy, 2));
		 }

}
