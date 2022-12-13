import java.util.Scanner;

public class PerfectNumberRec {
	static boolean perf(int a, int b) {

		if (b < a && a % b == 0)
			return false;
		else if (b < a) {
			return (perf(a, b + 1));

		} else
			return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("sayı= ");
		int a = scan.nextInt();
		System.out.println(perf(a, 2) == true ? "asal sayı " + a : "asal sayı değildir " + a);
	}

}
