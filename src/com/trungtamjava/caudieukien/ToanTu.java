package com.trungtamjava.caudieukien;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        int tong = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap gia tri x ");

        int x = sc.nextInt();

        if (x > 5) {
            tong=tong+1;
            System.out.println("ket qua if "+ tong);
        }else {
            tong= tong-1;
            System.out.println("ket qua else "+ tong);
        }


//        tong =(x >5 )? (tong+1):(tong-1);
//        System.out.println("ket qua ?: "+ tong);


    }
}
