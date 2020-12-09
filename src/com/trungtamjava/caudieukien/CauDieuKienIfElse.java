package com.trungtamjava.caudieukien;

import java.util.Scanner;

public class CauDieuKienIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" vui long nhap gia tri cua x ");

        int x = scan.nextInt();
// so sanh gia tri cua x voi 10
        if (x> 10 ){
            System.out.println(" gia tri cua x > 10 ");
        }else {
            if (x == 10) {
                System.out.println("gia tri cua x = 10");
            } else {
                System.out.println("gia tri cua x nho hon 10");
            }
        }
        System.out.println("ket thuc");
// So sanh gia tri cua y va x
        System.out.println(" vui long nhap gia tri cua y ");

        int y = scan.nextInt();

        if (y>x ){
            System.out.println(" gia tri cua y lon hon x ");
        }else if (y < x ){
            System.out.println(" gia tri cua y nho hon x ");
        }else {
            System.out.println("gia tri cua y = x ");
        }
        System.out.println("ket thuc");

    }
}
