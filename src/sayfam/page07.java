package sayfam;

import java.util.Scanner;

public class page07 {
    public static void main(String[] args) {

        double num1, num2;
        double sonuc = 0.0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        num1 = girdi.nextDouble();
        System.out.print("2.sayıyı giriniz: ");
        num2 = girdi.nextDouble();
        System.out.println("+,-,*,/  işlemlerinden birini seçiniz");
        String secilen_aritmeti_islem = girdi.next();
        switch (secilen_aritmeti_islem) {
            case "+":
                sonuc = num1 + num2;
                break;
            case "-":
                sonuc = num1 - num2;
                break;
            case "*":
                sonuc = num1 * num2;
                break;
            case "/":
                sonuc = num1 / num2;
                break;
        }
        System.out.println("seçilen aritmetik işlem sonucu: " + sonuc);

    }
}
