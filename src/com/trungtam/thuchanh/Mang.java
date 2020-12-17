package com.trungtam.thuchanh;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        System.out.println("vui long nhap gia tri phan tư cua mang");

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] mang = new int[n];
        System.out.println("vui long nhap cac phan tu \n ");
        for (int i =0; i < mang.length; i++){
            mang[i]= scan.nextInt();
        }
        System.out.println(" cac phan tu da nhap la \n ");
        for (int l : mang   ) {
            System.out.print(l+"," );
        }
        // tim gia tri max.
        System.out.println("\n gia tri max la ");
        int max = mang[0 ];
        for (int i = 0; i < mang.length; i++){
            if (max<mang[i]){
                max= mang[i];
            }
        }System.out.println(max);
        System.out.println("\n gia tri min la ");

        int min = mang[0];
        for (int l : mang ) {
           int i = 0;i++;
            if (min>mang[i]){
                min= mang[i];
            }
        }System.out.println(min);
    }
}
