package sayfam;

import java.util.Locale;
import java.util.Scanner;

public class ödev04 {
    public static void main(String[] args) {

        String üke_ismi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("yaşadığınız ülke ismini yazınız: ");
        üke_ismi = girdi.next();  // AMErika
        üke_ismi = üke_ismi.toLowerCase();  // amerika
        if (üke_ismi.equals("Amerika".toLowerCase())) {
            System.out.println("USA");
        } else if (üke_ismi.equals("İngiltere".toLowerCase())) {
            System.out.println("UK");
        } else if (üke_ismi.equals("Almanya".toLowerCase())) {
            System.out.println("DE");

        } else {
            System.out.println("NA");
        }


    }
}
