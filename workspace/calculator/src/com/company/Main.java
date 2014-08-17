package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer secim;
        Double sayi1;
        Double sayi2;
        Double toplam;
        Double fark;
        Double carpim;
        Double bolum;

        System.out.print("1 - Toplama" + "\n2 - Çıkarma" + "\n3 - Çarpma" + "\n4 - Bölme");

        System.out.print("\n\nLütfen yapmak istediğiniz işlemin başındaki numarayı yazınız: ");
        secim = input.nextInt();

        do {

            System.out.print("\nYanlış bir seçim yaptınız. Lütfen listeden yapmak istediğiniz işlemin başındaki numarayı yazınız: ");
            secim = input.nextInt();

        }

        while (secim < 1 || secim > 4);

        System.out.print("\n\nLütfen 1. sayıyı giriniz: ");
        sayi1 = input.nextDouble();

        System.out.print("\n\nLütfen 2. sayıyı giriniz: ");
        sayi2 = input.nextDouble();

        if (secim == 1) {

            toplam = sayi1 + sayi2;
            System.out.print("\n\nToplam = " + toplam);

        } else if (secim == 2) {
            fark = sayi1 - sayi2;
            System.out.print("\n\nFark = " + fark);

        } else if (secim == 3) {
            carpim = sayi1 * sayi2;
            System.out.print("\n\nÇarpım = " + carpim);

        } else if (secim == 4) {
            bolum = sayi1 / sayi2;
            System.out.print("\n\nBölüm = " + bolum);

        }
    }
}
