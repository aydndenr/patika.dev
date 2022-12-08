import java.util.Scanner;

public class ThreeAndFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,iter=0,sum=0,counter=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("3 e 4 e bölüm kalan hesaplanacak sayı giriniz");

		number=scan.nextInt();
		while(iter!=number) {
			iter=iter+1;
			if(iter%3==0&&iter%4==0) {
				sum=sum+iter;
				counter=counter+1;
				System.out.println(iter+" üçe ve dörde tam bölündüm");
			}
			else
				continue;
		}
		if(counter!=0)
		System.out.println("ortalama = "+sum/counter);
		else
			System.out.println("böle bir sayı yokmuş");
		}

}
