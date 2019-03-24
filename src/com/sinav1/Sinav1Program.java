package com.sinav1;

import java.util.Random;
import java.util.Scanner;

public class Sinav1Program {

	public static void main(String[] args) {

		Random IslemTuru = new Random();
		int a = IslemTuru.nextInt(2);

		Random Islemsayisi = new Random();
		int b = Islemsayisi.nextInt(10);

		Random girilenSayi = new Random();
		

		Sinav1Islem islem = new Sinav1Islem();

		switch (a) {
		case 0:
			for (int i = 0; i < b; i++) {
				int c = girilenSayi.nextInt(5);
				System.out.println("Ýþlem Türü: " + a + "\nÝþlem tekrarlanma sayýsý:" + b +  "\nfaktoriyel = " + islem.faktoriyelHesapla(c));
			}
			break;

		default:
			for (int i = 0; i < b; i++) {
				int c = girilenSayi.nextInt(100);
				System.out.println("Ýþlem Türü: " + a +  "\nÝþlem tekrarlanma sayýsý:" + b + "\nfonksiyon = " + islem.fonksiyon(c));

			}

			break;
		}

	}

}
