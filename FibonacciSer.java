import java.util.Scanner;

public class FibonacciSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int after,now=1,before=0,step;
		System.out.println("fibonacci kaç elemanlı olmalı");
	step=scan.nextInt()-1;
		System.out.println(before);
		System.out.println(now);
		for(int i =1;i<step;i++)
		{
			after=before+now;
			before=now;
			now=after;
			System.out.println(after);
			
		}
			
			
			
	}

}
