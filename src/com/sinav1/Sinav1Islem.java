package com.sinav1;

public class Sinav1Islem {

	int faktoriyelHesapla(int a) {
		int faktoriyel = 1;
		for (int i = 1; i <= a; i++) {
			faktoriyel = i * faktoriyel;
		}
		return faktoriyel;
	}

	int fonksiyon(int a) {
		return (a*a*a + (a - 3)*(a - 3) + 5);
	}

}
