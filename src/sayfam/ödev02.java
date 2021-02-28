package sayfam;

import java.util.Scanner;

public class ödev02 {
    public static void main(String[] args) {
        // kullanıcıdan adını ve soyadını alın ve bunların kaç harften oluştuğunu yzaınız
        String  isim, soy_isim;
        Scanner girdi = new Scanner(System.in);
        System.out.print("isimizi yazınız: ");
        isim = girdi.next();
        System.out.print("soy isimizi yazınız: ");
        soy_isim = girdi.next();
        int isim_uzunluk = isim.length();
        int soy_isim_uzunluk = soy_isim.length();
        System.out.println("ismiz: " +  isim_uzunluk +  " harflidir");
        System.out.println("soy ismiz: " +  soy_isim_uzunluk +  " harflidir");

    }
}
