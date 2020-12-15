package Section;

import java.util.Scanner;

public class Section1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" vui long nhap gia tri x, y ");

        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("tong hai so la "+ tong(x,y));
        System.out.println("tich hai so la " + tich(x,y));
        System.out.println("hieu hai so la " + hieu(x,y));
        System.out.println("thuong hai so la " + thuong(x,y));

        System.out.println("gia tri da nhap la "+ x);
        System.out.println("gia tri da nhap la "+ y);

        //căn bậc 2.
        //b= can(x2+y2)
        //x2+y2 = b2.

        double c = (Math.sqrt(x*x+y*y));
        double t = Math.PI*3;
        System.out.println("chieu dai canh " + c);

        //ax+b= 0 ; x= -b/a

        System.out.println("vui long nhap gia tri a va b ");

        double b = scan.nextDouble();
        double a = scan.nextDouble();

        double x1 = -b/a;
        System.out.println("gia tri cua phương trinh ax+b= 0"+ x1);



    }
    public static int tong (int x, int y ){
        return x+y;
    }
    public static int hieu (int x, int y ){
        return x-y;
    }
    public static int tich (int x, int y ){
        return x*y;

    }
    public static double thuong(int x,int y ){
       return x/y;
    }
}
