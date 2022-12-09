import java.util.Scanner;

public class NumberPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		number=scan.nextInt();
		for(int i =1;i<number;i*=4) {
System.out.println("dördün katları= "+i);			
			
		}
		for(int i =1;i<number;i*=5) {
			System.out.println("beşin katları = "+i);			
						
					}
	}

}
