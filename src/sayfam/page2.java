package sayfam;

import java.util.Scanner;

public class page2 {
    public static void main(String[] args) {
        int haftanın_gün_sayisi;
        String hatanın_günü = " ";
        Scanner girdi = new Scanner(System.in);
        System.out.print("Gün numarası giriniz: ");
        haftanın_gün_sayisi = girdi.nextByte();
        switch (haftanın_gün_sayisi){
            case 1:
                System.out.println("Pazaretesi: ");
                break;
            case 2:
                System.out.println("Salı: ");

                break;
            case 3:
                System.out.println("Çarşamba : ");
                break;
            case 4:
                System.out.println("Perşembe : ");
                break;
            case 5:
                System.out.println("Cuma : ");
                break;
            case 6:
                System.out.println("Cumartesi : ");
                break;
            case 7:
                System.out.println("Pazar : ");
                break;
            default:
                System.out.println("Yanlış Değer : ");

        }
    }
}
