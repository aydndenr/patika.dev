import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("sayı giriniz");
		
		int a,counter1,numb=0;
		a=scan.nextInt();
		while(a!=0)
		{
			numb=numb+(a%10);
			a/=10;
	
		}
		System.out.println("basamak toplamı = "+numb);
	}

}
