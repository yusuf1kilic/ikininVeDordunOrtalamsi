package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
         değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        Scanner input=new Scanner(System.in);
        int number,total=0;
        do {
            System.out.print("lütfen bir sayı giriniz : ");
            number= input.nextInt();
            if (number%8==0){
                total+=number;

            }else if (number%4==0){
                total+=number;
            }else if (number%2==0){
                total+=number;

            }

        }while (number%2!=1);

        System.out.println("Toplam : "+ total);

    }
}
