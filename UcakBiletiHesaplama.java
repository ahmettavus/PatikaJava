package Patika.KosulIfadeler;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance,age,travelType,totalPrice;
        //mesafe basina ucret 0.10TL
        System.out.println("Lutfen Verilerinizi Giriniz!");

        System.out.print("Lutfen Mesafeyi Belirtiniz!");
        distance = input.nextDouble();

        System.out.print("Lutfen Yasinizi Belirtiniz!");
        age = input.nextDouble();

        System.out.println("Lutfen Seyahat Turunu Belirtiniz 1 veya 2");
        travelType = input.nextDouble();

        totalPrice = 0.10*distance;

        if (age <= 12){
            System.out.println("Toplam Tutar : " + totalPrice * 0.5);
        } else if (age>=12 && age<=24 ) {
            System.out.println("Toplam Tutar :" + (totalPrice*0.9));

        }else if(age >= 65){
            System.out.println("Toplam Tutar : "+ (totalPrice*0.7));

        }else {
            System.out.println("Yanlis Deger Girdiniz!");
        }


    }
}
