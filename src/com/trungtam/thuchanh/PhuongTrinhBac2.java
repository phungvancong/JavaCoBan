package com.trungtam.thuchanh;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        //ax2+bx+c= 0.
        //neu a= 0 thi x =-c/b
        //neu a !=0 thi tinh delta b2-4ac
        //neu delta < 0, phuong trinh vo nghiem
        // neu dalta ==0, thì phương trinh x = -b/2a
        //delta >0, thì x1= (-b-can(delta)/2a; x2 = (-b+can(delta)/2a)

        System.out.println("vui long nhap gia tri cua a, b, c ");

        Scanner scan= new Scanner(System.in);

        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double c = scan.nextDouble();

        if (a ==0 ){
            System.out.println("nghiem se la "+ (-c/b));
        }else {
            double delta = b*b-(4*a*c);

            if (delta< 0 ){
                System.out.println("phuong trinh vo nghiem ");
            }else  if (delta == 0){
                System.out.println("phuong trinh co nghiem la "+ -b/(2*a));
            }else {
                double x1 = (-b-Math.sqrt(delta))/2*a;
                double x2 = (-b+Math.sqrt(delta))/2*a;

                System.out.println("gia tri nghiem 1 la "+ x1);
                System.out.println("gia tri nghiem 2 la "+ x2);
            }
        }
    }
}
