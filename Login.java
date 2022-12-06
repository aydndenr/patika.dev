import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id, pass;
		Scanner scan = new Scanner(System.in);

		System.out.println("Kullanıcı Adı");
		id = scan.nextLine();
		System.out.println("Parola");
		pass = scan.nextLine();
		if (id.equals("patika") && pass.equals("java123")) {
			System.out.println("Giriş başarılı");
		} else if (id.equals("patika") && pass.equals("java123") == false) {
			System.out.println("şifre yanlış sıfırlamak için 'S' tuşuna basınız");
			if (scan.nextLine().equals("S")) {
				System.out.println("yeni şifre =?");
				pass = scan.nextLine();
				if (pass.equals("java123")) {
					while (pass.equals("java123")) {
						System.out.println("Başka şifre giriniz şifre aynı olamaz");
						pass = scan.nextLine();
					}
				}
			} else
				System.out.println("şifre değiştirildi giriş başarılı");
		} else {
			System.out.println("kullanıcı adı hatalı");
		}
	}

}
