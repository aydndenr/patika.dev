import java.util.Scanner;

public class Astrology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int month,day;
			Scanner scan=new Scanner(System.in);
			System.out.println("dogdugun ay");
			month=scan.nextInt();
			System.out.println("dogdugun gün");
			day=scan.nextInt();
			if(month<1||month>12) {
				
			}
			if((month==3&&day>=21&&day<32)||(month==4&&day<=20&&day>0)) {
				System.out.println(" koç burcu");
			}
			else if((month==4&&day>=21&&day<31)||(month==5&&day<=21&&day>0)) {
				System.out.println(" boğa burcu");
			}
			else if((month==5&&day>=22&&day<32)||(month==6&&day<=22&&day>0)) {
				System.out.println(" ikizler burcu");
			}
			else if((month==6&&day>=23&&day<31)||(month==7&&day<=22&&day>0)) {
				System.out.println(" yengeç burcu");
			}
			else if((month==7&&day>=23&&day<32)||(month==8&&day<=22&&day>0)) {
				System.out.println(" aslan burcu");
			}
			else if((month==8&&day>=23&&day<32)||(month==9&&day<=22&&day>0)) {
				System.out.println(" başak burcu");
			}
			else if((month==9&&day>=23&&day<31)||(month==10&&day<=22&&day>0)) {
				System.out.println(" terazi burcu");
			}
			else if((month==10&&day>=23&&day<32)||(month==11&&day<=21&&day>0)) {
				System.out.println(" akrep burcu");
			}
			else if((month==11&&day>=22&&day<31)||(month==12&&day<=21&&day>0)) {
				System.out.println(" yay burcu");
			}
			else if((month==12&&day>=22&&day<32)||(month==1&&day<=21&&day>0)) {
				System.out.println(" oğlak burcu");
			}
			else if((month==1&&day>=22&&day<32)||(month==2&&day<=19&&day>0)) {
				System.out.println(" kova burcu");
			}
			else if((month==2&&day>=20&&day<30)||(month==3&&day<=20&&day>0)) {
				System.out.println(" balık burcu");
			}
			else  {
				System.out.println(" Hatalı işlem yaptınız.");
			}
			
			
			
	}

}
