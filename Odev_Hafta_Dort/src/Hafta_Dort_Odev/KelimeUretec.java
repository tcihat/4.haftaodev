package Hafta_Dort_Odev;

import java.util.Random;
import java.util.Scanner;

public class KelimeUretec {

	String OgrenciadıUret(int harfsayisi) {
		Random rnd = new Random();
		char[] alfabe = new char[26];
		char[] ogrencininadi = new char[harfsayisi];

		int a = 0;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			alfabe[a] = ch;
			a++;
		}
		String kelime = "";
		for (int i = 0; i < harfsayisi; i++) {

			int y = rnd.nextInt(26);
			ogrencininadi[i]=alfabe[y];
			kelime=kelime+ogrencininadi[i];

		}

		return kelime;
	}

}
