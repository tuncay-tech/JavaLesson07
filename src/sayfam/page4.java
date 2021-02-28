package sayfam;

import java.util.Scanner;

public class page4 {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.print("öğrenci numarasını giriniz: ");
        int numarası = girdi.nextInt();
        switch (numarası) {
            case 321:
                System.out.println("Notunuz : 98 ");
                break;
            case 213:
                System.out.println("Notunuz :87");

                break;
            case 354:
                System.out.println("Notunuz :99 ");
                break;
            case 124:
                System.out.println("Notunuz :100 ");
                break;
            case 150:
                System.out.println("Notunuz :92 ");
                break;
            default:
                System.out.println("Notunuz Bulunamadı");
        }
    }
}
