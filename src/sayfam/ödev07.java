package sayfam;

import java.util.Scanner;

public class ödev07 {
    public static void main(String[] args) {
        String yasadınız_ülke_ismi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("yaşadığınz ülke ismini giriniz : ");
        yasadınız_ülke_ismi = girdi.next();

        if (yasadınız_ülke_ismi.length()>2){
            System.out.println("istenen: " + yasadınız_ülke_ismi.toUpperCase().charAt(1) +
            yasadınız_ülke_ismi.toUpperCase().charAt(yasadınız_ülke_ismi.length()-2));
        }
    }
}
