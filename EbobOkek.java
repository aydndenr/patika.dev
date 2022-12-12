import java.util.Scanner;

public class EbobOkek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int one, two, three = 0, ebob = 1, ekok;
		System.out.println("birinci sayı= ");
		one = scan.nextInt();
		System.out.println("ikinci sayı= ");
		two = scan.nextInt();

		while (three < one || three < two) {
			three = three + 1;
			if (one % three == 0 && two % three == 0) {
				ebob = three;
			}

		}
		ekok = (two * one) / ebob;
		System.out.println("ebob = " + ebob + "  okek= " + ekok);
	}

}
