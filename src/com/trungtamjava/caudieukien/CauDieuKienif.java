package com.trungtamjava.caudieukien;

import java.util.Scanner;

public class CauDieuKienif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" vui long nhap gia tri cua x");

        int x = scan.nextInt();

        if (x> 5){
            System.out.println(" gia tri cua x lon hon 5 ");
        }
        if (x< 5){
            System.out.println(" gia tri cua x nho hon 5 ");
        }
        if (x== 5){
            System.out.println(" gia tri cua x bang 5 ");
        }
        if (x> 10){
            System.out.println(" gia tri cua x lon hon 10 ");
        }
        if (x!= 5){
            System.out.println(" gia tri cua x khac  5 ");
        }
        if (x< 1){
            System.out.println(" gia tri cua x nho hon 1 ");
        }
        System.out.println("ket thuc");
    }
}
