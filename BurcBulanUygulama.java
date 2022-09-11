package Patika.KosulIfadeler;

import java.util.Scanner;

public class BurcBulanUygulama {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int month,day;

        System.out.println("Lutfen Dogdugunuz Ayi giriniz!");

        month = input.nextInt();

        System.out.println("Lutfen Dogdugunuz gun degerini giriniz!");

        day = input.nextInt();

        String burc = "";
        boolean isError = false;

        if(month == 1 && day >= 1 && day <= 31) {
            if(day <= 21) {
                burc = "Oğlak Burcu";
            } else {
                burc = "Kova Burcu";
            }
        } else if(month == 2 && day >= 1 && day <= 29) {
            if (day <= 19) {
                burc = "Kova Burcu";
            } else {
                burc = "Balık Burcu";
            }
        } else if(month == 3 && day >= 1 && day <= 31) {
            if (day <= 20) {
                burc = "Balık Burcu";
            } else {
                burc = "Koç Burcu";
            }
        } else if (month == 4 && day >= 1 && day <= 30) {
            if (day <= 20) {
                burc = "Koç Burcu";
            } else {
                burc = "Boğa Burcu";
            }
        } else if (month == 5 && day >= 1 && day <= 31) {
            if (day <= 21) {
                burc = "Boğa Burcu";
            } else {
                burc = "İkizler Burcu";
            }
        } else if (month == 6 && day >= 1 && day <= 30) {
            if (day <= 22) {
                burc = "İkizler Burcu";
            } else {
                burc = "Yengeç Burcu";
            }
        } else if (month == 7 && day >= 1 && day <= 31) {
            if (day <= 22) {
                burc = "Yengeç Burcu";
            } else {
                burc = "Aslan Burcu";
            }
        } else if (month == 8 && day >= 1 && day <= 31) {
            if (day <= 22) {
                burc = "Aslan Burcu";
            } else {
                burc = "Başak Burcu";
            }
        } else if (month == 9 && day >= 1 && day <= 30) {
            if (day <= 22) {
                burc = "Başak Burcu";
            } else {
                burc = "Terazi Burcu";
            }
        } else if (month == 10 && day >= 1 && day <= 31) {
            if (day <= 22) {
                burc = "Terazi Burcu";
            } else {
                burc = "Akrep Burcu";
            }
        } else if (month == 11 && day >= 1 && day <= 30) {
            if (day <= 21) {
                burc = "Akrep Burcu";
            } else {
                burc = "Yay Burcu";
            }
        } else if (month == 12 && day >= 1 && day <= 31) {
            if (day <= 21) {
                burc = "Yay Burcu";
            } else {
                burc = "Oğlak Burcu";
            }
        } else {
            isError = true;
        }


        if(isError) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("Burcunuz: " + burc);


        }
    }
}
