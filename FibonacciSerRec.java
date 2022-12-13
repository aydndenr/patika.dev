import java.util.Scanner;

public class FibonacciSerRec {
	static int fib(int n) {
		if(n==1||n==2) {
			return 1;
		}
		return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int ab=scan.nextInt();
System.out.println(fib(ab));
			
	}

}
