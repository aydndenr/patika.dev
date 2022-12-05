import java.io.*;
import java.util.*;
import java.util.ArrayList;



public class HesapMakinesi {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       int matematik, turkce, fizik, kimya,tarih,muzik;
       
       
       
       Scanner scan=new Scanner(System.in);
       System.out.println("Matematik:");
       matematik=scan.nextInt();
       System.out.println("turkce:");
       turkce=scan.nextInt();

       System.out.println("fizik:");
       fizik=scan.nextInt();

       System.out.println("kimya:");
       kimya=scan.nextInt();

       System.out.println("tarih:");
       tarih=scan.nextInt();

       System.out.println("müzik:");
       muzik=scan.nextInt();
       
       int toplam= matematik+turkce+fizik+kimya+tarih+muzik;
       double sonuc=toplam/6;
       System.out.println(sonuc>60 ? "Gecti":"kaldı");


    }
    
}