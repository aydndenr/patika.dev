import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		
		double km=2.2,minTut=20,acilis=10,gidilen;
		System.out.println("kaç km gidildi?=");
		gidilen=scan.nextDouble();
		
		System.out.println(acilis+(km*gidilen)<20 ? minTut:acilis+(km*gidilen));
		
		
		
	}

}
