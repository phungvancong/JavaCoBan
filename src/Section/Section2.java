package Section;

import java.util.Scanner;

public class Section2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" nhap chieu dai mang");

        int n = scan.nextInt();
        int[] mang = new int[n];
        System.out.println("nhap cac gia tri cua mang \n");
        for (int i = 0;i < mang.length; i++){
            mang[i] = scan.nextInt();
        }
        System.out.print("mang da nhap\n" );
        for (int l :mang)
            System.out.print( l+",");

        // sap xep tang dan .
        for (int i = 0; i < mang.length; i++){
            int temp = mang[i];
            for (int j = i+1; j < mang.length;j++){
                if (temp > mang[j]){
                    mang[i]= mang[j];
                    mang[j]= temp;
                    temp= mang[i];
                }
            }
        }
        System.out.println("\nsap xep tang dan la \n");

        for (int l :mang)
            System.out.print( l+",");

        // sap xep giam dan.

        for (int i = 0; i < mang.length; i++){
            int temp = mang[i];
            for (int j = i+1; j < mang.length;j++){
                if (temp < mang[j]){
                    mang[i]= mang[j];
                    mang[j]= temp;
                    temp= mang[i];
                }
            }
        }
        System.out.println("\nsap xep giam dan la \n");

        for (int l :mang)
            System.out.print( l+",");
        System.out.println("\n nhap gia tri cua k ");
        int k = scan.nextInt();

        for ( int i = 0 ; i <mang.length; i ++){
            if (k== mang[i]){
                System.out.println("\n vi tri cua k la "+ i);
                break;
            }System.out.println("khong co gia tri nao cua k ");

        }


        //ax2+bx+c= 0.
        //neu a= 0 thi x =-c/b
        //neu a !=0 thi tinh delta b2-4ac
        //neu delta < 0, phuong trinh vo nghiem
        // neu dalta ==0, thì phương trinh x = -b/2a
        //delta >0, thì x1= (-b-can(delta)/2a; x2 = (-b+can(delta)/2a)
        // phuong trinh bac 2 voi 3 tham gia truyen vao.


        System.out.println("Vui long nhap gia tri cua tham so phuong trinh bac 2  a,b,c ");

        int a1= scan.nextInt();
        int b1 = scan.nextInt();
        int c1= scan.nextInt();

        //neu a = 0 ;

        if (a1==0 ){
            System.out.println("nghiem x la  "+(-c1/b1));
        }else if (a1!=0){
            int delta = b1*b1- 4*a1*c1;
            if (delta<0 ){
                System.out.println("phuong trinh vo nghiem ");

            }else if (delta == 0 ){
                System.out.println("phuong trinh co nghiem la " +( -b1/ (2*a1)));
            }else {
                double x1 = (-b1- Math.sqrt(delta)/(2*a1));
                double x2 = (-b1+ Math.sqrt(delta)/(2*a1));

                System.out.println(" phuong trinh co 2 nghiem la x1 " +x1);
                System.out.println(" phuong trinh co 2 nghiem la x2 " +x2);
            }
        }
    }
}
