package sayfam;

import java.util.Scanner;

public class ödev05 {
    public static void main(String[] args) {
        // kullanıcıdan adını ve soyadını alın ve bunların ilk iki harflerini büyük yazdırın

        String isim, soy_isim;
        Scanner girdi = new Scanner(System.in);
        System.out.print("isimizi yazınız: ");
        isim = girdi.next();
        System.out.print("soy isimizi yazınız: ");
        soy_isim = girdi.next();
        System.out.println("isminizin ilk iki harfi: " + isim.toUpperCase().charAt(0) + " ve " + isim.toUpperCase().charAt(1));
        System.out.print("soy isminizin ilk iki harfi: " + soy_isim.toUpperCase().charAt(0) + " ve " + isim.toUpperCase().charAt(1));


    }
}
