package com.trungtamjava.caudieukien;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class CauDieuKienSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("vui long nhap gia tri cua x ");

        int x = scan.nextInt();

        switch (x){
            case 1 : System.out.println(" gia tri cua x = 1");
            break;
            case 2 : System.out.println("gia tri cua x = 2");
            break;
            case 3 : System.out.println(" gia tri cua x = 3 ");
            break;
            default:System.out.println("gia tri cua x khong phu hop");

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap gia ten do uong");

        String y = sc.nextLine();
        switch (y){
            case "cafe":System.out.println(" chon cafe");
            break;
            case "trasua": System.out.println("chon tra sua");
            break;
            case " nuoc" : System.out.println("chon nuoc loc ");

            default: System.out.println("tra da ");
        }
    }
}
