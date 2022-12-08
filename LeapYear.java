import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year;
		System.out.println("yıl girişi yapınız");
		year = scan.nextInt();
		if (year < 0) {
			System.out.println("yanlış yıl girildi");
			return;}

		if (year % 4 == 0 && ((year % 400 == 0) || (year % 100 != 0)))

			System.out.println(year + " yılı bir artık yıldır");

		else
			System.out.println(year + " yılı bir artık yıl değildir");

	}

}
