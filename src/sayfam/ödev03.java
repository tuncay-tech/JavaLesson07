package sayfam;

import java.util.Scanner;

public class ödev03 {
    public static void main(String[] args) {
        // kullanıcıdan adını ve soyadını alın ve bunların ilk harflerini buüyük yazdırın
        String  isim, soy_isim;
        Scanner girdi = new Scanner(System.in);
        System.out.print("isimizi yazınız: ");
        isim = girdi.next();
        System.out.print("soy isimizi yazınız: ");
        soy_isim = girdi.next();
        System.out.println("isminizin ilk harfi: " + isim.toUpperCase().charAt(0));
        System.out.println("soy isminizin ilk harfi: " + soy_isim.toUpperCase().charAt(0));
    }
}
