package pake;

import com.menu19.HinhTronMenu;
import com.menu19.HinhVuongMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("vui long chon ");

        System.out.println(" chon 1 la tinh dien tich, chu vi hinh vuong");
        System.out.println(" chon 2 la tinh dien tich, chu vi hinh tron");

        int x = scan.nextInt();

        switch (x){
            case 1 : System.out.println(" ban da chon 1 ");
            System.out.println("nhap gia tri chieu dai hinh vuong");

            float chieDai = scan.nextFloat();

            System.out.println("dien tich hinh vuong "+ HinhVuongMenu.dienTich(chieDai));
            System.out.println("chu vi  hinh vuong "+ HinhVuongMenu.chuVi(chieDai));
            break;
            case 2 : System.out.println("ban da chon 2 " );
                System.out.println("nhap gia tri ban kinh");

            float banKinh = scan.nextFloat();

            System.out.println("dien tich hinh tron "+ HinhTronMenu.dienTich(banKinh));
            System.out.println("chu vi hinh tron "+ HinhTronMenu.chuVi(banKinh));
            break;
            default:
                System.out.println("ban vui long lua chon 1 or 2 nhes ");
        }
        System.out.println("ket thuc chương trinh");

        if (x ==1){
            System.out.println("nhap gia tri chieu dai hinh vuong");
            float chieDai = scan.nextFloat();


            System.out.println("dien tich hinh vuong "+ HinhVuongMenu.dienTich(chieDai));
            System.out.println("chu vi  hinh vuong "+ HinhVuongMenu.chuVi(chieDai));

        }else if (x==2){
            System.out.println("nhap gia tri ban kinh");
            float banKinh = scan.nextFloat();


            System.out.println("dien tich hinh tron "+ HinhTronMenu.dienTich(banKinh));
            System.out.println("chu vi hinh tron "+ HinhTronMenu.chuVi(banKinh));
        }else {
            System.out.println("ban vui long lua chon 1 or 2 nhes ");
        }System.out.println("ket thuc chương trinh");
    }

}
