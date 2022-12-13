import java.util.Scanner;

public class PalindromNumber {
	static boolean isPalindrom(int number) {
		int temp=number,reverseNumber=0,lastNumber;
		while(temp !=0) {
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
		}
		if(number==reverseNumber) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int numb=scan.nextInt();
			if(isPalindrom(numb))
			{
				System.out.println(numb+" palindrom sayıdır");
			}
			else
				System.out.println(numb+" palindrom sayı değildir");

		
	}

}
