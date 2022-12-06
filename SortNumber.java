import java.util.Scanner;

public class SortNumber {

	public static void main(String[] args) {
	
	int a,b,c;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("birinci sayıyı gir a olsun");
	a=scan.nextInt();
	System.out.println("ikinci sayı gir b olsun ");
	b=scan.nextInt();
	System.out.println("üçüncü sayı gir c olsun");
	c=scan.nextInt();
	if(a>b && a>c)
	{
		System.out.println((b>c)? "c<b<a":"b<c<a");
	}
	else if(b>a && b>c)
	{
		System.out.println((a>c)? "c<a<b":"a<c<b");
		
	}
	else
		System.out.println((a>b)?"b<a<c":"a<b<c");
	
	
	
	}
}
