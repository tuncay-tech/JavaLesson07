package sayfam;

import java.util.Scanner;

public class ödev06 {
    public static void main(String[] args) {
        // kullanıcıdan yaşadığı ülke ismini alın ve bunların ilk iki harflerini büyük yazdırın

        String yasadınız_ülke_ismi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("yaşadığınz ülke ismini giriniz : ");
        yasadınız_ülke_ismi = girdi.next();
        System.out.println("isminizin ilk iki harfi: " + yasadınız_ülke_ismi.toUpperCase().charAt(0) +
                " ve " + yasadınız_ülke_ismi.toUpperCase().charAt(1));


    }
}
