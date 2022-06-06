package day067;

import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        String regex="[0-4]+";
        while (input.hasNext(regex)){
            String next = input.next(regex);
            System.out.println(next);
        }
    }
}
