package Patika.KosulIfadeler;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Degerini Giriniz.");
        int year = scanner.nextInt();

        if(year%100==0){
            if(year%400==0){
                System.out.println(year +" Artık yıldır.");
            }
            else{
                System.out.println(year +" Artık yıl değildir.");
            }
        }else if(year %4 ==0){
            System.out.println(year +" Artık yıldır.");
        }else{
            System.out.println(year + " Artık yıl değildir.");
        }
    }
}
