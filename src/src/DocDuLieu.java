package src;

import java.util.Scanner;

public class DocDuLieu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" vui long nhap vao gia tri" );

        int x = scan.nextInt();

        System.out.println(" gia tri cua x la \t"+ x );

        System.out.println("vui long nhap vao gia tri cua 2 so y va z ");

        double y = scan.nextDouble();
        short z = scan.nextShort();

        double t = y+z;
        System.out.println(" tong 2 so y va z la " +t);

        System.out.println("nhap gia tri cua b va s");
        boolean b = scan.nextBoolean();
        String s = scan. nextLine();

        System.out.println(b+s);
    }
}
