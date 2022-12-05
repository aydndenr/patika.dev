import java.util.Scanner;

public class DaireAlanVeYaricap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);

		double re,alan,cevre,daireDilim,alfa;
		System.out.println("Yarıçap Değeri= ");
		
		re=scan.nextDouble();
		System.out.println("Dilim açısı= ");
		alfa=scan.nextDouble();

		alan=Math.PI*Math.pow(re, 2);
		cevre=2*Math.PI*re;
		daireDilim=(Math.PI*(Math.pow(re,2))*alfa)/360;
		System.out.println("Alan="+alan+"cevre= "+cevre+"Dilimin alanı= "+ daireDilim);

	}

}
