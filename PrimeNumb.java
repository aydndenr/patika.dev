import java.util.Scanner;

public class PrimeNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program çalıştı");

		for (int i = 2; i < 101; i++) {
			boolean right=true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
right=false;

				} 

			}
			if(right==true)
			System.out.print(" " + i);
		}

	}

}
