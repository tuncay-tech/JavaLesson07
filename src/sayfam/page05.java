package sayfam;

import java.util.Locale;
import java.util.Scanner;

public class page05 {
    public static void main(String[] args) {

        String şehir_ismi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir Şehir İsmi Giriniz: ");
        şehir_ismi = girdi.next();

        switch (şehir_ismi.toLowerCase()) {
            case "istanbul":
                System.out.println("Plaka no: 34 ");
                break;
            case "ankara":
                System.out.println("Plaka no:06");
                break;
            case "antalya":
                System.out.println("Plaka no:07 ");
                break;
            case "bursa":
                System.out.println("plaka no:16 ");
                break;
            case "bitlis":
                System.out.println("Plaka no: 13 ");
                break;
            default:
                System.out.println("Sehir Bulunamadı");
        }
    }
}
