package sayfam;

import java.util.Scanner;

public class page3 {
    public static void main(String[] args) {

        int not;
        Scanner girdi = new Scanner(System.in);
        System.out.println("notunuzu giriniz: ");
        not = girdi.nextInt();
        if (not <= 100 && not > 84) {
            System.out.println("Pekiiyi");
        } else if (not < 85 && not > 69) {
            System.out.println("İyi");
        } else if (not < 70 && not > 59) {
            System.out.println("Orta");
        } else if (not<60&& not>44) {
            System.out.println("Zayıf");

        }else if (not>=0&& not<45) {
            System.out.println("kaldı");
        }else {
            System.out.println("yanlış not");
        }
    }
}

