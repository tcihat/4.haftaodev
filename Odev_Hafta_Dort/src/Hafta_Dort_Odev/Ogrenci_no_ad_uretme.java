package Hafta_Dort_Odev;

import java.util.Random;
import java.util.Scanner;

public class Ogrenci_no_ad_uretme {

	public static void main(String[] args) {
		Random rnd=new Random();
		
		 KelimeUretec  kelime=new KelimeUretec();
		  System.out.println("Ogrenci ismi harf sayisi = ");
		  Scanner scn =new Scanner(System.in);
		  int harfsayisi=scn.nextInt();	  
		
		  for (int i=1;i<=10;i++) {
			  OgrenciClass Ogrenci=new OgrenciClass();
			  Ogrenci.Numara=rnd.nextInt(100);
			  Ogrenci.Ad=kelime.OgrenciadıUret(harfsayisi);
			  
			  System.out.println(i+". Öğrenci adı = "+Ogrenci.Ad+" , Öğrencinin numarası = "+Ogrenci.Numara);
		  }
		  
		 }
	static  void  okuladi1(String Baslik) {
		System.out.println("***************Java 1 Kursu******************");
		System.out.println("********Fatih bilişim Okulu****************");
		System.out.println("****************************");
	}
	
	
	 static  void  okuladi(String baslik) {
		System.out.println("****************"+baslik+"*****************");
		System.out.println("********Fatih bilişim Okulu****************");
		System.out.println("****************************");
	}

	 static  void  Ayrac(String ayrac) {
			System.out.println("****************************");
		}
	 static  void  Deger(String baslik, int deger) {
			System.out.println("**"+baslik+" = "+ deger+"**");
			
		}
	 
}
