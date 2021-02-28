package sayfam;

import java.util.Scanner;

public class ödev01 {
    public static void main(String[] args) {
        // KUULANICIDAN KREDİ kartı numarasını alın ve bu numarasının üçüncü, dördüncü ve
        // sonuncu rakamalarını ekrana yazdırın.

        int kredi_kartı_no;
        Scanner girdi = new Scanner(System.in);
        System.out.print("kredi kart numaranızı giriniz:");
        kredi_kartı_no = girdi.nextInt();
        String str_degeri = String.valueOf(kredi_kartı_no);// int değerini stringe çeviriyoroz
      //  String str_degeri = Integer.valueOf(kredi_kartı_no).toString();  // buda olabilir int değerini stringe çeviriyoroz
        // örenek: 232456767867 kredi no

        if (str_degeri.length()>=5){
            System.out.println("ÜÇÜNCÜ SAYI: " + str_degeri.charAt(2));
            System.out.println("DÖRDÜNCÜ SAYI: " + str_degeri.charAt(3));
            System.out.println("SONUNCU SAYI SAYI: " + str_degeri.charAt(str_degeri.length()-1));
        }else{
            System.out.println("hatalı kredi kartı no girdiniz");
        }


    }
}
